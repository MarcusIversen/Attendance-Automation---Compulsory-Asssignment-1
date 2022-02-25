package gui.model;

import be.Student;
import bll.StudentManager;

import java.sql.SQLException;
import java.util.List;

public class StudentModel {
    private StudentManager studentManager;

    public StudentModel() {
        studentManager = new StudentManager();
    }

    public List<Student> getStudentsA() throws SQLException {
        List<Student> allAStudents = studentManager.getStudentA();
        return allAStudents;
    }

    public List<Student> getStudentsB() throws SQLException {
        List<Student> allBStudents = studentManager.getStudentB();
        return allBStudents;
    }
}
