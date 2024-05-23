package com.example.tppoo;
import java.util.List;
import java.util.ArrayList;

public class Question {
    private String prompt;
    private Categorie categorie;
    private TypeQuestion type;
    private List<String> options; // Pour QCU et QCM
    private List<String> repense;

    public Question(String question, Categorie categorie, TypeQuestion type, List<String> options, List<String> repense) {
        this.prompt=question;
        this.categorie = categorie;
        this.type = type;
        this.options = options;
        this.repense = repense;

    }

    public Question(String prompt, Categorie categorie, TypeQuestion type) {
        this.prompt = prompt;
        this.categorie = categorie;
        this.type=type;
    }

    public String getPrompt() {
        return prompt;
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
}
