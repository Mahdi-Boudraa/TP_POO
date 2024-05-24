package com.example.back;
import java.util.List;

public class QuestionPatient {
    private String question;
    private Categorie categorie;
    private TypeQuestion type;
    private List<String> options; // Pour QCU et QCM
    private List<String> repense;
    private int score;

    public QuestionPatient(String question, Categorie categorie, TypeQuestion type) {
        this.question = question;
        this.categorie = categorie;
        this.type=type;
    }

    public QuestionPatient(String question, Categorie categorie, TypeQuestion type, List<String> options, List<String> repense) {
        this.question=question;
        this.categorie = categorie;
        this.type = type;
        this.options = options;
        this.repense = repense;

    }

    public String getQuestion() {
        return question;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public TypeQuestion getType(){
        return type;
    }

    public List<String> getOtions(){
        return options;
    }

    public List<String> getRepense(){
        return repense;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score=score;
    }
}

