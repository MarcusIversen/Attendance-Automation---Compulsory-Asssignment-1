package gui.model;

import be.Absence;
import bll.AbsenceManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.List;

public class AbsenceModel {
    private AbsenceManager absenceManager;

    public AbsenceModel() {
        absenceManager = new AbsenceManager();
    }

    public List<Absence> getAbsence() throws SQLException {
        ObservableList<Absence> absence = (ObservableList<Absence>) absenceManager.getAbsence();
        return absence;
    }
}
