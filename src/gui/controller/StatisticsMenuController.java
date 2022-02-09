package gui.controller;


import be.Absence;
import be.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class StatisticsMenuController implements Initializable {

    @FXML
    private Button btnClose;
    @FXML
    private BorderPane borderPane;

    @FXML
    private TableView<Student> tvStudent;

    @FXML
    private TableColumn<Student, String> tcName;

    @FXML
    private TableColumn<Student, String> tcPresent;

    @FXML
    private TableColumn<Student, Double> tcTotal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        borderPane.setCenter(buildBarChart());

        tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        tcPresent.setCellValueFactory(new PropertyValueFactory<>("Present"));
        tcTotal.setCellValueFactory(new PropertyValueFactory<>("Total"));

        //add your data to the table here.
        tvStudent.setItems(students);
    }

    // add your data here from any source
    private ObservableList<Student> students = FXCollections.observableArrayList(
            new Student("Kim Jong Un", "Yes", "80.00 %"),
            new Student("Henrik Henriksen", "Yes", "60.54 %"),
            new Student("John Johnson", "Yes", "45.21 %"),
            new Student("Andy Lam", "No", "20.42 %"),
            new Student("Theis Andersen", "Yes", "24.12 %"),
            new Student("Anders Andersen", "No", "56.23 %"),
            new Student("Trine Thomsen", "Yes", "76.42 %"),
            new Student("Lone Hansen", "No", "4.02 %"),
            new Student("Hans Vestergaard", "Yes", "1.02 %"),
            new Student("Kristian Hollænder", "Yes", "6 %"),
            new Student("Alexander Christensen", "Yes", "9 %"),
            new Student("Peter Petersen", "Yes", "3.45 %"),
            new Student("Jens Jensen", "No", "23.65 %"),
            new Student("Mathias Ferniss", "No", "77.42 %")
    );


    private BarChart buildBarChart() {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Student");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Absence in %");

        BarChart barChart = new BarChart(xAxis, yAxis);

        XYChart.Series data = new XYChart.Series();
        data.setName("Total Absence");

        //provide data
        data.getData().add(new XYChart.Data("Kim Jong Un", 80 ));
        data.getData().add(new XYChart.Data("The Dictator", 40));
        data.getData().add(new XYChart.Data("Andy Lam", 30));
        data.getData().add(new XYChart.Data("Mathias Ferniss", 25));
        data.getData().add(new XYChart.Data("Mathias F", 25));
        data.getData().add(new XYChart.Data("Mathias Fernet", 25));
        data.getData().add(new XYChart.Data("Mathias Far", 25));
        data.getData().add(new XYChart.Data("Mathias Fyr", 25));

        barChart.getData().add(data);
        barChart.setLegendVisible(false);

        return barChart;
    }

    public void handleClose(ActionEvent actionEvent){
        System.exit(0);
    }


}
