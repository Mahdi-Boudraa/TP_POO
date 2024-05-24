package com.example.front;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TestsAnamneses {

    private void changeScene(Event event, String fxmlFileName) {
        try {
            Parent newView = FXMLLoader.load(getClass().getResource(fxmlFileName));
            Scene newScene = new Scene(newView);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(newScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleDashBoardButtonClick(Event event) {
        changeScene(event, "/com/example/tppoo/dashboard.fxml");
    }

    @FXML
    public void handleAppointmentsButtonClick(Event event) {
        changeScene(event, "/com/example/tppoo/appoitments.fxml");
    }

    @FXML
    public void handlePatientsButtonClick(Event event) {
        changeScene(event, "/com/example/tppoo/patients.fxml");
    }

    @FXML
    public void handleTestsButtonClick(Event event) {
        changeScene(event, "/com/example/tppoo/tests_anamneses.fxml");
    }
}
