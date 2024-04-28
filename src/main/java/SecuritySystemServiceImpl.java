import com.smarthome.service.*;
import io.grpc.stub.StreamObserver;

public class SecuritySystemServiceImpl extends SecuritySystemServiceGrpc.SecuritySystemServiceImplBase {
    @Override
    // This method is called when the client sends a request to arm or disarm the security system
    public StreamObserver<SecurityStatus> reportStatus(StreamObserver<SystemResponse> responseObserver) { // client streaming RPC
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
    // This method is called when the client sends a request to monitor the security system
    public StreamObserver<SecurityCommand> monitorSystem(StreamObserver<SecurityEvent> responseObserver) { // server streaming RPC
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



}