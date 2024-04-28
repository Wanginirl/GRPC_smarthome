import com.ecwid.consul.v1.QueryParams;
import com.smarthome.service.LightControlServiceGrpc;
import com.smarthome.service.TemperatureRequest;
import com.smarthome.service.TemperatureResponse;
import com.smarthome.service.TemperatureSensorServiceGrpc;
import io.grpc.stub.StreamObserver;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.smarthome.service.*;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;

import java.util.List;
public class SmartHomeClient {
    private ConsulClient consulClient;
    private String consulHost;
    private int consulPort;

    public SmartHomeClient(String host, int port) {
        this.consulHost = host;
        this.consulPort = port;
        this.consulClient = new ConsulClient(consulHost, consulPort);
    }

    private int getServicePort(String serviceName) {
        // Get the list of healthy services from Consul and pick the first one from the
        List
                <HealthService> services = consulClient.getHealthServices(serviceName, true, QueryParams.DEFAULT).getValue();
        if (!services.isEmpty()) {
            return services.get(0).getService().getPort();
        } else {
            throw new RuntimeException("No healthy service instances found for service: " + serviceName);
        }
    }

    public void toggleLight(boolean status) {
        int port = getServicePort("LightControlService");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
        LightControlServiceGrpc.LightControlServiceBlockingStub stub = LightControlServiceGrpc.newBlockingStub(channel);
        ToggleRequest request = ToggleRequest.newBuilder().setStatus(status).build();
        ToggleResponse response = stub.toggleLight(request);
        System.out.println("Toggle light response: " + response.getResult());
        channel.shutdown();
    }

    public void streamTemperature() {
        int port = getServicePort("TemperatureSensorService");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
        TemperatureSensorServiceGrpc.TemperatureSensorServiceStub stub = TemperatureSensorServiceGrpc.newStub(channel);
        StreamObserver<TemperatureResponse> responseObserver = new StreamObserver<TemperatureResponse>() {
            @Override
            public void onNext(TemperatureResponse value) {
                System.out.println("Current Temperature: " + value.getTemperature());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Temperature stream error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Temperature stream completed.");
                channel.shutdown();
            }
        };
        stub.streamTemperature(TemperatureRequest.newBuilder().build(), responseObserver);
    }
    public void reportStatus() {
        int port = getServicePort("SecuritySystemService");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
        SecuritySystemServiceGrpc.SecuritySystemServiceStub stub = SecuritySystemServiceGrpc.newStub(channel);
        StreamObserver<SecurityStatus> requestObserver = stub.reportStatus(new StreamObserver<SystemResponse>() {
            @Override
            public void onNext(SystemResponse value) {
                System.out.println("Status acknowledged: " + value.getAcknowledged());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error reporting status: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Report status completed.");
                channel.shutdown();
            }
        });
        // Simulating sending status reports
        try {
            for (int i = 0; i < 5; i++) {
                requestObserver.onNext(SecurityStatus.newBuilder().setStatus("Status #" + i).build());
                Thread.sleep(1000);  // wait a second before sending the next status
            }
            requestObserver.onCompleted();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void monitorSystem() {
        int port = getServicePort("SecuritySystemService");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
        SecuritySystemServiceGrpc.SecuritySystemServiceStub stub = SecuritySystemServiceGrpc.newStub(channel);
        StreamObserver<SecurityEvent> responseObserver = new StreamObserver<SecurityEvent>() {
            @Override
            public void onNext(SecurityEvent event) {
                System.out.println("Received event: " + event.getEvent());
            }
            @Override
            public void onError(Throwable t) {
                System.err.println("Error in monitoring system: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Monitoring system stream completed.");
                channel.shutdown();
            }
        };
        StreamObserver<SecurityCommand> requestObserver = stub.monitorSystem(responseObserver);
        // Simulate sending commands
        try {
            requestObserver.onNext(SecurityCommand.newBuilder().setCommand("Activate alarm").build());
            Thread.sleep(500); // simulate delay
            requestObserver.onNext(SecurityCommand.newBuilder().setCommand("Deactivate alarm").build());
            Thread.sleep(500); // simulate delay
            requestObserver.onNext(SecurityCommand.newBuilder().setCommand("Status check").build());
            Thread.sleep(500); // simulate delay

            // Mark the end of commands
            requestObserver.onCompleted();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {
        SmartHomeClient client = new SmartHomeClient("localhost", 8500);

        // Toggle light
        client.toggleLight(true);  // Turn the light ON
        client.toggleLight(false); // Turn the light OFF

        // Stream temperatures
        client.streamTemperature();

        // Report security status
        client.reportStatus();

    }
}
