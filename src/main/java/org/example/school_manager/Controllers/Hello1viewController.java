package org.example.school_manager.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;
import org.example.school_manager.HelloApplication;

import java.io.IOException;
import java.util.Objects;

public class Hello1viewController {

    @FXML
    private TableColumn<?, ?> dateOfBirth;

    @FXML
    private TableColumn<?, ?> firstname;

    @FXML
    private TableColumn<?, ?> id;

    @FXML
    private TableColumn<?, ?> lastname;

    @FXML
    private TableColumn<?, ?> placeOfBirth;

    @FXML
    private TableColumn<?, ?> stat;

    public void onregister1() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("register1.fxml")));
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
