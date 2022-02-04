package gui.controller;

import be.Absence;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentInfoMenuController implements Initializable {

    @FXML
    private Button checkInBtn;
    @FXML
    private TableView <Absence>tvDailyAbsence;
    @FXML
    private TableColumn tcDay;
    @FXML
    private TableColumn tcAbsence;
    @FXML
    private BorderPane borderPane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        borderPane.setCenter(buildPieChart());


    }
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
}
