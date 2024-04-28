import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SmartHomeApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/GUI.fxml"));
        primaryStage.setTitle("Smart Home Control Panel");
        primaryStage.setScene(new Scene(root, 400, 300));  // Adjust the size as needed
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}