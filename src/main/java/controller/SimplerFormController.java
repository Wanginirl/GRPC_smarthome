package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class SimplerFormController {
    @FXML
    public TextField nameTextField;

    @FXML
    public Button submitButton;

    @FXML
    void submitButtonClickOnAction(ActionEvent event) {
        System.out.println("SubmitButtonClickOnAction clicked");
        String name = nameTextField.getText();
        System.out.println("nameTextField: " + name);
    }
}
