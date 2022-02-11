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

    public XYChart.Series getBarDataA(){
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
    public XYChart.Series getBarDataB(){
        XYChart.Series data = new XYChart.Series();
        data.getData().add(new XYChart.Data("Vladimir Putin", 20 ));
        data.getData().add(new XYChart.Data("Ole hans", 30.54));
        data.getData().add(new XYChart.Data("Emil Lindberg", 50.21));
        data.getData().add(new XYChart.Data("Bambi Short", 80.42));
        data.getData().add(new XYChart.Data("Jensen Jensen", 44.12));
        data.getData().add(new XYChart.Data("Rasmus Rasmussen", 26.23));
        data.getData().add(new XYChart.Data("Line Thomsen", 46.42));
        data.getData().add(new XYChart.Data("Camilla Westergaard", 8.02));
        data.getData().add(new XYChart.Data("Hans Hollander", 60.05));
        data.getData().add(new XYChart.Data("Julie Jul", 15.46));
        data.getData().add(new XYChart.Data("Peter Pan", 90.35));
        data.getData().add(new XYChart.Data("Egon Olsen", 99.99));
        data.getData().add(new XYChart.Data("Benny kel", 69.69));
        return data;
    }
}
