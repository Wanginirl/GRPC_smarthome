
import com.smarthome.heater.heaterservice.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HeaterClient {

    private final ManagedChannel channel;
    private final HeaterServiceGrpc.HeaterServiceStub stub;

    public HeaterClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        this.stub = HeaterServiceGrpc.newStub(channel);
    }

    public void sendUnaryRequest(String name) {
        UnaryRequest request = UnaryRequest.newBuilder()
                .setName(name)
                .build();
        stub.sendUnaryRequest(request, new StreamObserver<UnaryResponse>() {
            @Override
            public void onNext(UnaryResponse response) {
                System.out.println("Unary response from server: " + response.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in unary request: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Unary request completed");
            }
        });
    }

    public void heaterInformation(String clientName) {
        StreamObserver<ClientInformation> requestObserver = stub.heaterInformation(new StreamObserver<ServerResponse>() {
            @Override
            public void onNext(ServerResponse response) {
                System.out.println("Server response: " + response.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in streaming client information: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Streaming client information completed");
            }
        });

        try {
            while (true) {
                String dateTime = LocalDateTime.now().toString();
                ClientInformation clientInfo = ClientInformation.newBuilder()
                        .setClientName(clientName)
                        .setDateTime(dateTime)
                        .build();
                requestObserver.onNext(clientInfo);
                Thread.sleep(5000); // Send information every 5 seconds
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        requestObserver.onCompleted();
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        String host = "localhost";
        int port = 8080;
        String clientName = "Client01.ncirl.com";

        HeaterClient client = new HeaterClient(host, port);
        client.sendUnaryRequest(clientName); // Send unary request

        // Start streaming client information
        Thread streamThread = new Thread(() -> client.heaterInformation(clientName));
        streamThread.start();

        // Wait for user input to stop streaming
        System.out.println("Press 'Q' to stop streaming client information");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                streamThread.interrupt();
                break;
            }
        }

        // Shutdown client
        client.shutdown();
    }
}

