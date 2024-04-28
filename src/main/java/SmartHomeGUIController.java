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
        // This needs proper handling for asynchronous updates. This is just a placeholder.
        outputArea.appendText("Streaming temperature...\n");
    }

    @FXML
    private void handleReportStatus() {
        client.reportStatus();
        outputArea.appendText("Reporting status...\n");
    }
}