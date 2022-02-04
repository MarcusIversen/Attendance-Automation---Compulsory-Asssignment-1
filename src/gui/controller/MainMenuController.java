package gui.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController{

    private String passwordField1 = "123";

    @FXML
    private Button btnSwitch;

    @FXML
    private Button btnHelp;

    @FXML
    private PasswordField passwordField;

    public void goToStudentInfo() throws Exception {
        if (passwordField.getText().equals(passwordField1)) {
            Stage switcher = (Stage) btnSwitch.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/gui/view/StudentInfoMenu.fxml"));
            Scene scene = new Scene(root);
            switcher.setScene(scene);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Wrong CPR Nr.");
            alert.setHeaderText("Please contract the administration");
            alert.setContentText("The CPR nr. must be 10 characters");
            alert.showAndWait();
        }
    }

    public void help() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Please contact the administration");
        alert.setHeaderText("Please contract the administration");
        alert.setContentText("Contact the administration for help");
        alert.showAndWait();
    }
}
