package gui.controller;

import be.Absence;
import bll.AbsenceManager;
import bll.ChartManager;
import gui.model.AbsenceModel;
import gui.model.ChartModel;
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

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TeacherStudentInfoController implements Initializable {
    @FXML
    private Button btnClose;
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

    private AbsenceModel absenceModel = new AbsenceModel();
    private ChartModel chartModel = new ChartModel();
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
            tvDailyAbsence.setItems((ObservableList<Absence>) absenceModel.getAbsence());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private PieChart buildPieChart() throws SQLException {
        //Create Piechart Object
        PieChart pieChart = new PieChart(chartModel.getPieData());
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

    public void handleClose(){
        Stage stage = (Stage) btnClose.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
