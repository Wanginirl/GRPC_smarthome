import com.smarthome.service.*;
import io.grpc.stub.StreamObserver;

public class SecuritySystemServiceImpl extends SecuritySystemServiceGrpc.SecuritySystemServiceImplBase {
    @Override
    public StreamObserver<SecurityStatus> reportStatus(StreamObserver<SystemResponse> responseObserver) {
        return new StreamObserver<SecurityStatus>() {
            @Override
            public void onNext(SecurityStatus securityStatus) {
                System.out.println("Received security status: " + securityStatus.getStatus());  // Handle incoming status here, such as logging or alerting based on the status
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error in receiving security status: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                // Once all messages are processed, send an acknowledgment
                responseObserver.onNext(SystemResponse.newBuilder().setAcknowledged(true).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<SecurityCommand> monitorSystem(StreamObserver<SecurityEvent> responseObserver) {
        return new StreamObserver<SecurityCommand>() {
            @Override
            public void onNext(SecurityCommand securityCommand) {
                System.out.println("Received command: " + securityCommand.getCommand()); // Process each command and generate an event, e.g., "Alarm activated"
                SecurityEvent event = SecurityEvent.newBuilder()
                        .setEvent("Processed command: " + securityCommand.getCommand())
                        .build();
                responseObserver.onNext(event);
            }
            @Override
            public void onError(Throwable t) {
                System.err.println("Error in command stream: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Complete the response stream after all commands have been processed
                responseObserver.onCompleted();
            }
        };
    }
//    @Override
//    public StreamObserver<BidirectionalRequest> bidirectionalStream(StreamObserver<BidirectionalResponse> responseObserver) {
//        return new StreamObserver<BidirectionalRequest>() {
//            @Override
//            public void onNext(BidirectionalRequest request) {
//                System.out.println("Received message from client: " + request.getMessage());
//
//                // Respond to the client's message with a stream
//                for (int i = 0; i < 5; i++) {
//                    BidirectionalResponse response = BidirectionalResponse.newBuilder()
//                            .setMessage("Response " + i)
//                            .build();
//                    responseObserver.onNext(response);
//                }
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                System.err.println("Error from client: " + t.getMessage());
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("Client stream completed");
//                responseObserver.onCompleted(); // Complete the response stream
//            }
//        };
//    }
//    @Override
//    public StreamObserver<ClientInformation> streamClientInformation(StreamObserver<ServerResponse> responseObserver) {
//        return new StreamObserver<ClientInformation>() {
//            @Override
//            public void onNext(ClientInformation clientInfo) {
//                System.out.println("Received client information:");
//                System.out.println("Client Name: " + clientInfo.getClientName());
//                System.out.println("Date and Time: " + clientInfo.getDateTime());
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                System.err.println("Error in client information streaming: " + t.getMessage());
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("Client information streaming completed");
//                ServerResponse response = ServerResponse.newBuilder()
//                        .setMessage("Client information streaming completed")
//                        .build();
//                responseObserver.onNext(response);
//                responseObserver.onCompleted();
//            }
//        };
//    }
//}
}