package bll;

import dal.ChartDAO;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.sql.SQLException;

public class ChartManager {

    private ChartDAO chartDAO = new ChartDAO();

    /**
     * Gets the list of pieChartData using the getStudents method in StudentDAO.
     * @return
     */
    public ObservableList<PieChart.Data> getPieData() throws SQLException {
        ObservableList<PieChart.Data> allPieData = chartDAO.getPieData();
        return allPieData;
    }

    public XYChart.Series getBarData(){
        XYChart.Series data = chartDAO.getBarData();
        return data;
    }
}
