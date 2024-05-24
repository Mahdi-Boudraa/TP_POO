package com.example.front;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogIn {

    @FXML
    AnchorPane anchorPane1 ;
    @FXML
    AnchorPane anchorPane2 ;
    @FXML
    TextField email ;
    @FXML
    PasswordField password ;
    @FXML
    Text emailNotExisting ;
    @FXML
    Text wrongPassword ;


    public void handleConnectionButton (Event event) throws IOException {
        String userEmail = email.getText();
        String userPassword = password.getText();

        if (FilesHandlingFunctions.doesUserExist("accounts.txt",userEmail)){
            if (FilesHandlingFunctions.passwordEquals("accounts.txt", userEmail,userPassword)) {
                emailNotExisting.setText("");
                wrongPassword.setText("");
                try {
                    // Load the Second side
                    Parent secondView = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                    Scene secondScene = new Scene(secondView);

                    // Get the current stage (window) using the event's source
                    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

                    // Set the new scene on the current stage
                    window.setScene(secondScene);
                    window.setTitle("Log In");
                    window.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else {
                emailNotExisting.setText("");
                wrongPassword.setText("Le mot de passe n'est pas correct");
                wrongPassword.setStyle("-fx-fill: #de0914;" +
                        "-fx-font-family: 'Product Sans Bold';" +
                        "-fx-font-weight: bold;" +
                        "-fx-font-size: 14;");
            }
        }
        else {
            // handle user doesn't exist
            wrongPassword.setText("");
            emailNotExisting.setText("Email n'existe pas");
            emailNotExisting.setStyle("-fx-fill: #de0914;" +
                    "-fx-font-family: 'Product Sans Bold';" +
                    "-fx-font-weight: bold;" +
                    "-fx-font-size: 18;");
        }

    }


    public void handleSignUpLink (Event event) throws IOException {
        try {
            // Load the Second side
            Parent secondView = FXMLLoader.load(getClass().getResource("sign-up.fxml"));
            Scene secondScene = new Scene(secondView);

            // Get the current stage (window) using the event's source
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

            // Set the new scene on the current stage
            window.setScene(secondScene);
            window.setTitle("Sign Up");
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
