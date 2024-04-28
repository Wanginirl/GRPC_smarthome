import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SmartHomeGUIController {
    private SmartHomeClient client = new SmartHomeClient("localhost", 8500);

    @FXML
    private TextArea outputArea;

    @FXML
    private void handleToggleLightOn() {
        client.toggleLight(true);
        outputArea.appendText("Light turned ON\n");
    }

    @FXML
    private void handleToggleLightOff() {
        client.toggleLight(false);
        outputArea.appendText("Light turned OFF\n");
    }

    @FXML
    private void handleStreamTemperature() {
        client.streamTemperature(temperature -> {
            Platform.runLater(() -> {
                outputArea.appendText("Current Temperature: " + temperature + "\n");
            });
        });
        outputArea.appendText("Streaming temperature...\n");
    }

    @FXML
    private void handleReportStatus() {
        client.reportStatus();
        outputArea.appendText("Reporting status...\n");
    }@FXML
    private void handleMonitorSystem() {
        client.monitorSystem();
        outputArea.appendText("Monitoring system...\n");
    }
}