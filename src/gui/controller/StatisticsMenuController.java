package gui.controller;


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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class StatisticsMenuController implements Initializable {

    @FXML
    public BorderPane borderPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        borderPane.setCenter(buildBarChart());
    }


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
        data.getData().add(new XYChart.Data("The dictator", 40));
        data.getData().add(new XYChart.Data("Andy Lam Nguyen", 30));
        data.getData().add(new XYChart.Data("Mathias Ferniss", 25));

        barChart.getData().add(data);
        barChart.setLegendVisible(false);

        return barChart;
    }


}
