package be;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Student {

    private SimpleStringProperty name;
    private SimpleStringProperty present;
    private SimpleDoubleProperty total;

    public Student(String name, String present, Double total) {
        this.name = new SimpleStringProperty(name);
        this.present = new SimpleStringProperty(present);
        this.total = new SimpleDoubleProperty(total);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public String getPresent() {
        return present.get();
    }

    public void setPresent(String present) {
        this.present = new SimpleStringProperty(present);
    }

    public Double getTotal() {
        return total.get();
    }

    public void setTotal(Double total) {
        this.total = new SimpleDoubleProperty(total);
    }
}
