package dal;

import be.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class StudentDAO {

    public List<Student> getStudentsA(){
        ObservableList<Student> students = FXCollections.observableArrayList(
                new Student("Kim Jong Un", "Yes", "80.00 %"),
                new Student("Henrik Henriksen", "No", "60.54 %"),
                new Student("John Johnson", "No", "45.21 %"),
                new Student("Andy Lam", "No", "20.42 %"),
                new Student("Theis Andersen", "No", "24.12 %"),
                new Student("Anders Andersen", "No", "56.23 %"),
                new Student("Trine Thomsen", "No", "76.42 %"),
                new Student("Lone Hansen", "No", "4.02 %"),
                new Student("Hans Vestergaard", "No", "1.02 %"),
                new Student("Kristian Hollænder", "No", "6 %"),
                new Student("Alexander Christensen", "No", "9 %"),
                new Student("Peter Petersen", "No", "3.45 %"),
                new Student("Jens Jensen", "No", "23.65 %"),
                new Student("Mathias Ferniss", "No", "77.42 %")
        );
        return students;
    }
    public List<Student> getStudentsB(){
        ObservableList<Student> students = FXCollections.observableArrayList(
                new Student("Vladimir Putin", "No", "20.00 %"),
                new Student("Ole hans", "Yes", "30.54 %"),
                new Student("Emil Lindberg", "Yes", "50.21 %"),
                new Student("Bambi Short", "Yes", "80.42 %"),
                new Student("Jensen Jensen", "Yes", "44.12 %"),
                new Student("Rasmus Rasmussen", "No", "26.23 %"),
                new Student("Line Thomsen", "Yes", "46.42 %"),
                new Student("Camilla Westergaard", "Yes", "8.02 %"),
                new Student("Hans Hollander", "Yes", "60.05 %"),
                new Student("Julie Jul", "Yes", "15.46 %"),
                new Student("Peter Pan", "Yes", "9 %"),
                new Student("Peter Petersen", "No", "90.35 %"),
                new Student("Egon Olsen", "Yes", "99.99 %"),
                new Student("Benny kel", "Yes", "69.69 %")
        );
        return students;
    }
}
