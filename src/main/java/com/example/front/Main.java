package com.example.front;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javax.crypto.SecretKey;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FilesHandlingFunctions.createFileIfNotExists("accounts.txt") ;
        String fxmlFilePath = "/com/example/tppoo/appoitments.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFilePath));
        Scene scene = new Scene(loader.load(), 1000, 680);
        // Load the icon image
        Image icon = new Image("file:C:/Users/ya727/Desktop/javaCodes/TP-POO-2024/src/main/resources/org/example/tppoo2024/pictures/logo_blue.png");
        // Set the application icon
        stage.getIcons().add(icon);
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}