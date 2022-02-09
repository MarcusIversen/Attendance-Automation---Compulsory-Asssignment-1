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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StatisticsMenuController implements Initializable {

    @FXML
    private Button btnLogOut;

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
            new Student("Henrik Henriksen", "No", "60.54 %"),
            new Student("John Johnson", "No", "45.21 %"),
            new Student("Andy Lam", "No", "20.42 %"),
            new Student("Theis Andersen", "No", "24.12 %"),
            new Student("Anders Andersen", "No", "56.23 %"),
            new Student("Trine Thomsen", "No", "76.42 %"),
            new Student("Lone Hansen", "No", "4.02 %"),
            new Student("Hans Vestergaard", "No", "1.02 %"),
            new Student("Kristian Hollænder", "No", "6 %"),
            new Student("Alexander Christensen", "No", "9 %"),
            new Student("Peter Petersen", "No", "3.45 %"),
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
        data.getData().add(new XYChart.Data("Henrik Henriksen", 60.54));
        data.getData().add(new XYChart.Data("John Johnson", 45.21));
        data.getData().add(new XYChart.Data("Andy Lam", 20.42));
        data.getData().add(new XYChart.Data("Theis Andersen", 24.12));
        data.getData().add(new XYChart.Data("Anders Andersen", 56.23));
        data.getData().add(new XYChart.Data("Trine Thomsen", 76.42));
        data.getData().add(new XYChart.Data("Hans Vestergaard", 1.02));
        data.getData().add(new XYChart.Data("Kristian Hollænder", 6));
        data.getData().add(new XYChart.Data("Alexander Christensen", 9));
        data.getData().add(new XYChart.Data("Peter Petersen", 3.45));
        data.getData().add(new XYChart.Data("Jens Jensen", 23.65));
        data.getData().add(new XYChart.Data("Mathias Ferniss", 77.42));

        barChart.getData().add(data);
        barChart.setLegendVisible(false);

        return barChart;
    }

    public void handleClose(ActionEvent actionEvent){
        System.exit(0);
    }

    public void handleLogOut(ActionEvent actionEvent) throws IOException {
        Stage switcher = (Stage) btnLogOut.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/gui/view/LoginMenu.fxml"));
        Scene scene = new Scene(root);
        switcher.setScene(scene);
    }


}
