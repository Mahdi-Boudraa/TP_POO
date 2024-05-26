package com.example.back;

import java.io.Serializable;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class Exercice implements Serializable {
    private String consigne;
    private String materiel;

    public Exercice(String consigne) {
        this.consigne = consigne;
    }

    public Exercice(String consigne, String materiel) {
        this.consigne=consigne;
        this.materiel=materiel;
    }

    public String getConsigne() {
        return consigne;
    }


    public String getMateriel() {
        return materiel;
    }

}
