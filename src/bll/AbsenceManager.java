package bll;

import be.Absence;
import be.Student;
import dal.AbsenceDAO;
import javafx.scene.chart.XYChart;

import java.sql.SQLException;
import java.util.List;

public class AbsenceManager {

    private AbsenceDAO absenceDAO = new AbsenceDAO();

    /**
     * Gets the list of absences using the getAbsence method in absenceDAO.
     */
    public List<Absence> getAbsence() throws SQLException {
        List<Absence> allAbsences = absenceDAO.getAbsence();
        return allAbsences;
    }
}
