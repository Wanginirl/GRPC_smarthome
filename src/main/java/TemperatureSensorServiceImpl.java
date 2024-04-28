import com.smarthome.service.TemperatureRequest;
import com.smarthome.service.TemperatureResponse;
import com.smarthome.service.TemperatureSensorServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.Random;

public class TemperatureSensorServiceImpl extends TemperatureSensorServiceGrpc.TemperatureSensorServiceImplBase {
    @Override
    public void streamTemperature(TemperatureRequest request, StreamObserver<TemperatureResponse> responseObserver) {
        Random random = new Random();
        try {
            for (int i = 0; i < 10; i++) {
                double temperature = 20 + 10 * random.nextDouble();  // Generate random temperature between 20 to 30
                TemperatureResponse response = TemperatureResponse.newBuilder()
                        .setTemperature(temperature)
                        .build();
                responseObserver.onNext(response);
                Thread.sleep(1000);  // Simulate delay for data sending
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            responseObserver.onCompleted();
        }
    }
}