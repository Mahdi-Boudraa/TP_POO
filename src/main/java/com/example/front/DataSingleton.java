package com.example.front;

import com.example.back.Exercice;
import com.example.back.Ortho;

public class DataSingleton {
    private static DataSingleton instance;
    private String data;
    private Ortho ortho ;
    private Question question ;

    public Exercice getExercice() {
        return exercice;
    }

    public void setExercice(Exercice exercice) {
        this.exercice = exercice;
    }

    private Exercice exercice ;
    private int tab ;

    public int getTab() {
        return tab;
    }

    public void setTab(int tab) {
        this.tab = tab;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public static void setInstance(DataSingleton instance) {
        DataSingleton.instance = instance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String date ;

    public Ortho getOrtho() {
        return ortho;
    }

    public void setOrtho(Ortho ortho) {
        this.ortho = ortho;
    }



    private DataSingleton() {}

    public static DataSingleton getInstance() {
        if (instance == null) {
            instance = new DataSingleton();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
