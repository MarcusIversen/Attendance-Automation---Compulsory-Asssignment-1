package gui.model;

import bll.ChartManager;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.sql.SQLException;

public class ChartModel {
    private ChartManager chartManager;

    public ChartModel() {
        chartManager = new ChartManager();
    }

    public ObservableList<PieChart.Data> getPieData() throws SQLException {
        ObservableList<PieChart.Data> allPieData = chartManager.getPieData();
        return allPieData;
    }

    public XYChart.Series getBarDataA(){
        XYChart.Series data = chartManager.getBarDataA();
        return data;
    }
    public XYChart.Series getBarDataB(){
        XYChart.Series data = chartManager.getBarDataB();
        return data;
    }
}
