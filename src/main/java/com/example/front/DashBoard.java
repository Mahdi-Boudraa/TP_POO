package com.example.front;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoard implements Initializable {

    @FXML
    Button dashBoard ;
    @FXML
    Button myPatients ;
    @FXML
    Button myAppointments ;
    @FXML
    Button tests ;
    @FXML
    Button settings ;
    @FXML
    Button payments ;
    @FXML
    Button notifications;
    @FXML
    Button downloadData ;
    @FXML
    Button logOut ;
    @FXML
    Text nextPatientName ;
    @FXML
    Text doctorName ;
    @FXML
    Text index1 ;
    @FXML
    Text index2 ;
    @FXML
    Text index3 ;

    public void initialize (URL url , ResourceBundle rb) {

        //fill doctor name
        doctorName.setText("Dr. Boudraa Mahdi");
        doctorName.setStyle("-fx-fill: #0282c2; -fx-font-weight: bold; -fx-text-alignment: left;");
        // fill patient name
        nextPatientName.setText("Apres 10 min");
        nextPatientName.setStyle("-fx-fill: #000000; -fx-font-weight: bold; -fx-text-alignment: left;");
        // fill statistics
        index1.setText("123");
        index1.setStyle("-fx-fill: #ffffff; -fx-font-family: Product Sans Bold ; -fx-font-weight: bold; -fx-text-alignment: left;");
        index2.setText("23");
        index2.setStyle("-fx-fill: #ffffff; -fx-font-family: Product Sans Bold ; -fx-font-weight: bold; -fx-text-alignment: left;");
        index3.setText("14");
        index3.setStyle("-fx-fill: #ffffff; -fx-font-family: Product Sans Bold ; -fx-font-weight: bold; -fx-text-alignment: left;");
        // fill charts

    }

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
