package gui.controller;

import be.Absence;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentInfoMenuController implements Initializable {
    @FXML
    private Button btnLogOut;
    @FXML
    private Button checkInBtn;
    @FXML
    private TableView<Absence> tvDailyAbsence;
    @FXML
    private TableColumn<Absence, String> tcDay;
    @FXML
    private TableColumn<Absence, String> tcAbsence;
    @FXML
    private BorderPane borderPane;

    private boolean hasCheckedIn = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        borderPane.setCenter(buildPieChart());

        tcDay.setCellValueFactory(new PropertyValueFactory<>("day"));
        tcAbsence.setCellValueFactory(new PropertyValueFactory<>("absence"));

        //add your data to the table here.
        tvDailyAbsence.setItems(absence);
    }

    // add your data here from any source
    private ObservableList<Absence> absence = FXCollections.observableArrayList(
            new Absence("Monday", "80 %"),
            new Absence("Tuesday", "60 %"),
            new Absence("Wednesday", "40 %"),
            new Absence("Thursday", "15 %"),
            new Absence("Friday", "5 %")
    );

    private PieChart buildPieChart() {
        //Create Data
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Monday", 80),
                new PieChart.Data("Tuesday", 60),
                new PieChart.Data("Wednesday", 40),
                new PieChart.Data("Thursday", 15),
                new PieChart.Data("Friday", 5)
        );

        //Create Piechart Object
        PieChart pieChart = new PieChart(pieChartData);
        pieChart.setTitle("Total Absence");
        pieChart.setClockwise(true);
        pieChart.setLabelLineLength(3);
        pieChart.setLabelsVisible(true);
        pieChart.setStartAngle(180);

        return pieChart;
    }

    public void checkInButton() {
        if (hasCheckedIn == true) {
           checkInBtn.setText("You are now checked in!");
           hasCheckedIn = false;
        } else {
            checkInBtn.setText("You are now checked out!");
            hasCheckedIn = true;
        }
    }

    public void goLogout(ActionEvent actionEvent) throws IOException {
        Stage switcher = (Stage) btnLogOut.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/gui/view/LoginMenu.fxml"));
        Scene scene = new Scene(root);
        switcher.setScene(scene);
    }
}
