import com.smarthome.bulb.bulbservice.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class Client {

    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 8080;

    public static void main(String[] args) {
        // Create a channel to the server
        ManagedChannel channel = ManagedChannelBuilder.forAddress(SERVER_HOST, SERVER_PORT)
                .usePlaintext()
                .build();

        // Create a stub for the bidirectional service
        BulbServiceGrpc.BulbServiceStub stub = BulbServiceGrpc.newStub(channel);

        // Create a response observer for the server streaming
        StreamObserver<BidirectionalResponse> responseObserver = new StreamObserver<BidirectionalResponse>() {
            @Override
            public void onNext(BidirectionalResponse response) {
                System.out.println("Server message: " + response.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error from server: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Server stream completed");
            }
        };

        // Create a request observer for the client streaming
        StreamObserver<BidirectionalRequest> requestObserver = stub.bidirectionalStream(responseObserver);

        try {
            // Send some messages to the server
            for (int i = 0; i < 5; i++) {
                String message = "Message " + i;
                BidirectionalRequest request = BidirectionalRequest.newBuilder()
                        .setMessage(message)
                        .build();
                System.out.println("Sending message to server: " + message);
                requestObserver.onNext(request);
            }
        } catch (Exception e) {
            System.err.println("Error while sending messages: " + e.getMessage());
        }

        // Mark the end of requests to the server
        requestObserver.onCompleted();

        // Shutdown the channel gracefully
        try {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("Interrupted while shutting down the channel: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
