package dal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class ChartDAO {

    public ObservableList<PieChart.Data> getPieData() {

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Monday", 80),
                new PieChart.Data("Tuesday", 60),
                new PieChart.Data("Wednesday", 40),
                new PieChart.Data("Thursday", 15),
                new PieChart.Data("Friday", 5));
        return pieChartData;
    }

    public XYChart.Series getBarData(){
        XYChart.Series data = new XYChart.Series();
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
        return data;
    }
}
