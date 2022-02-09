package gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginMenuController implements Initializable {


    private String usernameFieldStudent = "Bo";

    private String passwordFieldStudent = "1";

    private String usernameFieldTeacher = "Ole";

    private String passwordFieldTeacher = "1";

    @FXML
    private Button btnSwitch;

    @FXML
    private Button btnHelp;

    @FXML
    private TextField textField;

    @FXML
    private PasswordField passwordField;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void goToStudentInfo() throws Exception {
        if (passwordField.getText().equals(passwordFieldStudent) && textField.getText().equals(usernameFieldStudent)) {
            Stage switcher = (Stage) btnSwitch.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/gui/view/StudentInfoMenu.fxml"));
            switcher.setTitle("Student Info");
            Scene scene = new Scene(root);
            switcher.setScene(scene);
        } else if (passwordField.getText().equals(passwordFieldTeacher) && textField.getText().equals(usernameFieldTeacher)) {
            Stage switcher = (Stage) btnSwitch.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/gui/view/StatisticsMenu.fxml"));
            Scene scene = new Scene(root);
            switcher.setTitle("Student and Statistics");
            switcher.setScene(scene);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Wrong Username or Password");
            alert.setHeaderText("Please contract the administration");
            alert.setContentText("You can also try again");
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
