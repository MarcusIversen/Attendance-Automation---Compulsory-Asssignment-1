package be;

import javafx.beans.property.SimpleStringProperty;

public class Absence {
    private SimpleStringProperty day;
    private SimpleStringProperty absence;

    public String getDay() {
        return day.get();
    }

    public SimpleStringProperty dayProperty() {
        return day;
    }

    public void setDay(String day) {
        this.day.set(day);
    }

    public String getAbsence() {
        return absence.get();
    }

    public SimpleStringProperty absenceProperty() {
        return absence;
    }

    public void setAbsence(String absence) {
        this.absence.set(absence);
    }

    public Absence(SimpleStringProperty day, SimpleStringProperty absence) {
        this.day = day;
        this.absence = absence;
    }
}
