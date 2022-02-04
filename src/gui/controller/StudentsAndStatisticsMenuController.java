package gui.controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentsAndStatisticsMenuController {

    private String usernameField1 = "Bo";

    private String passwordField1 = "1";

    private String usernameFieldTeacher = "Ole";

    private String passwordFieldTeacher = "1";

    @FXML
    private Button btnSwitch;

    @FXML
    private Button btnHelp;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField textField;

    public void goToStudentInfo() throws Exception {
        if (passwordField.getText().equals(passwordField1) && textField.getText().equals(usernameField1)) {
            Stage switcher = (Stage) btnSwitch.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/gui/view/StudentInfoMenu.fxml"));
            Scene scene = new Scene(root);
            switcher.setScene(scene);
        } else if(passwordField.getText().equals(passwordFieldTeacher) && textField.getText().equals(usernameFieldTeacher)){
            Stage switcher = (Stage) btnSwitch.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/gui/view/StudentsAndStatisticsMenu.fxml"));
            Scene scene = new Scene(root);
            switcher.setScene(scene);
        }else {
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
