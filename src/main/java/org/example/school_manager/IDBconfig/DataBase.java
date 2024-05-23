package org.example.school_manager.IDBconfig;
import java.sql.Connection;
import java.sql.DriverManager;
public class DataBase {
    static  String host = "localhost";
    static String port = "3306";
    static String user = "root";
    static String password = "";
    static String database = "School_manager";
    static String URL = "jdbc:mysql://"+host+":"+port+"/"+database;

    public static Connection connectionDB() {
        try{
            return DriverManager.getConnection(URL, user, password);
        } catch (Exception e){
            return null;
        }
    }
}
