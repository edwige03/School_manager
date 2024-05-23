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

public class register1Controller {

    private Connection connection;
    private PreparedStatement prepStat;
    private ResultSet resultSet;

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
        String req = "INSERT INTO Student (firstname, lastname, dateOfBirth, placeOfBirth, stat) VALUES (?, ?, ?, ?, ?)";
        connection = DataBase.connectionDB();

        try {assert connection != null;
            PreparedStatement prepStat = connection.prepareStatement(req);
            prepStat.setString(1, firstname.getText());
            prepStat.setString(2, lastname.getText());
            prepStat.setString(3, String.valueOf(dateOfBirth.getValue()));
            prepStat.setString(4, placeOfBirth.getText());
            prepStat.setString(5, stat.getText());
//                prepStat.setString(6, "info_S.getText()");

            prepStat.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
