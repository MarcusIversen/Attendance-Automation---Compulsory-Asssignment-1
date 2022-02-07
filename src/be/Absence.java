package be;

import javafx.beans.property.SimpleStringProperty;

public class Absence {

    private SimpleStringProperty day;
    private SimpleStringProperty absence;

    public Absence(String day, String absence) {
        this.day = new SimpleStringProperty(day);
        this.absence = new SimpleStringProperty(absence);
    }

    public String getDay() {
        return day.get();
    }

    public void setDay(String day) {
        this.day = new SimpleStringProperty(day);
    }

    public String getAbsence() {
        return absence.get();
    }

    public void setAbsence(String absence) {
        this.absence = new SimpleStringProperty(absence);
    }
}
