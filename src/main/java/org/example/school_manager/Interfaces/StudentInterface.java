package org.example.school_manager.Interfaces;

import org.example.school_manager.models.Student;

import java.sql.SQLException;

public interface StudentInterface {

    void addStudent(Student student) throws SQLException;

}
