package org.example.school_manager.models;

import org.example.school_manager.IDBconfig.DataBase;
import org.example.school_manager.Interfaces.StudentInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student implements StudentInterface {
    int id;
    String firstname;
    String lastname;
    String dateOfBirth;
    String placeOfBirth;
    String stat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = String.valueOf(dateOfBirth);
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = String.valueOf(stat);
    }

    @Override
    public void addStudent(Student student) throws SQLException {

        String req = "INSERT INTO Student (firstname, lastname, dateOfBirth, placeOfBirth, stat) VALUES (?, ?, ?, ?, ?)";
        Connection connection = DataBase.connectionDB();

        assert connection != null;
        PreparedStatement prepStat = connection.prepareStatement(req);
        prepStat.setString(1, student.getFirstname());
        prepStat.setString(2, student.getLastname());
        prepStat.setString(3, student.getDateOfBirth());
        prepStat.setString(4, student.getPlaceOfBirth());
        prepStat.setString(5, student.getStat());
//                prepStat.setString(6, "info_S.getText()");

        prepStat.executeUpdate();


    }
}
