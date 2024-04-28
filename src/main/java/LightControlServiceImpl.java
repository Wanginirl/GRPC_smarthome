import com.smarthome.service.LightControlServiceGrpc;
import com.smarthome.service.ToggleRequest;
import com.smarthome.service.ToggleResponse;
import io.grpc.stub.StreamObserver;

public class LightControlServiceImpl extends LightControlServiceGrpc.LightControlServiceImplBase {
    @Override
    public void toggleLight(ToggleRequest req, StreamObserver<ToggleResponse> responseObserver) {
        boolean status = req.getStatus();
        System.out.println("Light toggled: " + (status ? "ON" : "OFF"));
        ToggleResponse response = ToggleResponse.newBuilder()
                .setResult(true)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}