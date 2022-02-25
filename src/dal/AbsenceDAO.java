package dal;

import be.Absence;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class AbsenceDAO {

    public List<Absence> getAbsence(){
        ObservableList<Absence> absence = FXCollections.observableArrayList(
                new Absence("Monday", "80 %"),
                new Absence("Tuesday", "60 %"),
                new Absence("Wednesday", "40 %"),
                new Absence("Thursday", "15 %"),
                new Absence("Friday", "5 %"));
        return absence;
    }

}
