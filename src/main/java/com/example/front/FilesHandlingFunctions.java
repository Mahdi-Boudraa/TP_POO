package com.example.front;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilesHandlingFunctions {

    public static ArrayList<String> getEmailsList(String filePath) {
        ArrayList<String> emailsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                if (lineNumber % 2 == 0) {
                    emailsList.add(line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return emailsList;
    }

    public static boolean passwordEquals(String filePath , String email, String password) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                if (lineNumber % 2 == 0) {
                    if (email.equals(line)){
                        if (password.equals(br.readLine())){
                            return true;
                        }
                    }
                    return false;
                }
                lineNumber++;
            }
        } catch (IOException e) {
            return false;
        }
        return false;
    }

    public static boolean doesUserExist (String filePath , String email) {
        if (getEmailsList(filePath).contains(email)) {
            return true;
        }
        return false;
    }

    public static boolean createFileIfNotExists(String filePath) {
        File file = new File(filePath);

        try {
            if (file.exists()) {
                return false ;
            } else {
                if (file.createNewFile()) {
                    return true;
                } else  {
                    return false ;
                }
            }
        } catch (IOException e) {
            return false;
        }
    }

    public static void writeLinesToFile(String filePath, ArrayList<String> lines) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();  // Adds a new line after each line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean createFolderIfNotExists(String folderPath) {
        File folder = new File(folderPath);

        // Check if the folder exists
        if (!folder.exists()) {
            // Attempt to create the folder
            boolean created = folder.mkdirs();
            if (created) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
