package gui.controller;


import be.Absence;
import be.Student;
import bll.ChartManager;
import bll.StudentManager;
import com.jfoenix.controls.JFXComboBox;
import gui.model.ChartModel;
import gui.model.StudentModel;
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

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class StatisticsMenuController implements Initializable {

    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Button btnStudentInfo;
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

    private StudentModel studentModel = new StudentModel();
    private ChartModel chartModel = new ChartModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        borderPane.setCenter(buildBarChartA());

        tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        tcPresent.setCellValueFactory(new PropertyValueFactory<>("Present"));
        tcTotal.setCellValueFactory(new PropertyValueFactory<>("Total"));

        //add your data to the table here.
        try {
            tvStudent.setItems((ObservableList<Student>) studentModel.getStudentsA());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        setUpCombo();
    }

    private BarChart buildBarChartA() {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Student");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Absence in %");

        BarChart barChart = new BarChart(xAxis, yAxis);

        XYChart.Series data = new XYChart.Series();
        data.setName("Total Absence");

        barChart.getData().add(chartModel.getBarDataA());
        barChart.setLegendVisible(false);

        return barChart;
    }


    private BarChart buildBarChartB() {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Student");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Absence in %");

        BarChart barChart = new BarChart(xAxis, yAxis);

        XYChart.Series data = new XYChart.Series();
        data.setName("Total Absence");

        barChart.getData().add(chartModel.getBarDataB());
        barChart.setLegendVisible(false);

        return barChart;
    }

    public void handleClose(){
        System.exit(0);
    }

    public void handleLogOut() throws IOException {
        Stage switcher = (Stage) btnLogOut.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/gui/view/LoginMenu.fxml"));
        Scene scene = new Scene(root);
        switcher.setTitle("Login Menu");
        switcher.setScene(scene);
    }


    public void handleStudentInfo() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/gui/view/TeacherStudentInfo.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Student Info");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void setUpCombo() {
        comboBox.getItems().addAll("CSe21A", "CSe21B");
        comboBox.getValue();
    }

    public void onChangeClass() throws SQLException {
        if (comboBox.getSelectionModel().isSelected(0))
        {
            borderPane.setCenter(buildBarChartA());
            tvStudent.setItems((ObservableList<Student>) studentModel.getStudentsA());
        } else if (comboBox.getSelectionModel().isSelected(1)) {
            borderPane.setCenter(buildBarChartB());
            tvStudent.setItems((ObservableList<Student>) studentModel.getStudentsB());
        } else
            return;
    }
}
