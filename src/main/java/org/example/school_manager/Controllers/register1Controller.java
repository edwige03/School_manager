package org.example.school_manager.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.school_manager.IDBconfig.DataBase;
import org.example.school_manager.models.Student;

public class register1Controller {

    @FXML
    private TextField Id;

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private TextField placeOfBirth;

    @FXML
    private TextField stat;

    public void Submit() {

        Student student = new Student();

        student.setFirstname(firstname.getText().trim());
        student.setLastname(lastname.getText().trim());
        student.setDateOfBirth(String.valueOf(dateOfBirth.getValue()));
        student.setPlaceOfBirth(placeOfBirth.getText().trim());
        student.setStat(Integer.parseInt(stat.getText().trim()));

        try {

            student.addStudent(student);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
