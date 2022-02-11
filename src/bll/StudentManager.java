package bll;

import be.Student;
import dal.StudentDAO;

import java.sql.SQLException;
import java.util.List;

public class StudentManager {

    private StudentDAO studentDAO = new StudentDAO();

    /**
     * Gets the list of students using the getStudents method in StudentDAO.
     */
    public List<Student> getStudent() throws SQLException {
        List<Student> allStudents = studentDAO.getStudents();
        return allStudents;
    }
}
