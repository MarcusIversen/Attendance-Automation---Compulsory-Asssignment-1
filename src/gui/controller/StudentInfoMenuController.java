package gui.controller;

import be.Absence;
import bll.AbsenceManager;
import bll.ChartManager;
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
import java.sql.SQLException;
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

    private AbsenceManager absenceManager = new AbsenceManager();
    private ChartManager chartManager = new ChartManager();
    private boolean hasCheckedIn = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            borderPane.setCenter(buildPieChart());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        tcDay.setCellValueFactory(new PropertyValueFactory<>("day"));
        tcAbsence.setCellValueFactory(new PropertyValueFactory<>("absence"));

        //add your data to the table here.
        try {
            tvDailyAbsence.setItems((ObservableList<Absence>) absenceManager.getAbsence());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private PieChart buildPieChart() throws SQLException {
        //Create Piechart Object
        PieChart pieChart = new PieChart(chartManager.getPieData());
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
        switcher.setTitle("Login Menu");
        switcher.setScene(scene);
    }
}
