package com.example.front;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class SignUp {

    @FXML
    TextField firstName ;
    @FXML
    TextField lastName ;
    @FXML
    TextField phoneNumber ;
    @FXML
    TextField address ;
    @FXML
    TextField email ;
    @FXML
    PasswordField password ;
    @FXML
    Text emailRemark ;
    @FXML
    Text fillAllFields ;


    public void handleConnectionButton (Event event) throws IOException {
        String userFirstName = firstName.getText();
        String userLastName = lastName.getText();
        String userPhoneNumber = phoneNumber.getText();
        String userAddress = address.getText();
        String userEmail = email.getText();
        String userPassword = password.getText();
        if (!userFirstName.isEmpty() && !userLastName.isEmpty() && !userPhoneNumber.isEmpty() && !userAddress.isEmpty() && !userEmail.isEmpty() && !userPassword.isEmpty()){
            if (FilesHandlingFunctions.doesUserExist("accounts.txt" , userEmail)){
                emailRemark.setText("Email deja existant");
                emailRemark.setStyle("-fx-fill: #de0914;" +
                        "-fx-font-family: 'Product Sans Bold';" +
                        "-fx-font-weight: bold;" +
                        "-fx-font-size: 14;");
            }
            else {
                fillAllFields.setText("");
                emailRemark.setText("");
                ArrayList<String> account = new ArrayList<String>();
                account.add(userEmail);
                account.add(userPassword);
                FilesHandlingFunctions.writeLinesToFile("accounts.txt",account);
                account.remove(0);
                account.remove(0);
                if (FilesHandlingFunctions.createFolderIfNotExists(userEmail)){
                    FilesHandlingFunctions.createFileIfNotExists(userEmail+"/doctor_data");
                    account.add(userFirstName);
                    account.add(userLastName);
                    account.add(userPhoneNumber);
                    account.add(userAddress);
                    account.add(userEmail);
                    account.add(userPassword);
                    FilesHandlingFunctions.writeLinesToFile(userEmail+"/doctor_data",account);
                }
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
        }
        else {
            fillAllFields.setText("Remplir tous les champs");
            fillAllFields.setStyle("-fx-fill: #de0914;" +
                    "-fx-font-family: 'Product Sans Bold';" +
                    "-fx-font-weight: bold;" +
                    "-fx-font-size: 18;");
        }

    }


    public void handleLogInLink (Event event) throws IOException {
        try {
            // Load the Second side
            Parent secondView = FXMLLoader.load(getClass().getResource("log-in.fxml"));
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
}
