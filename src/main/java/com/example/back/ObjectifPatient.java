package com.example.back;

public class ObjectifPatient {
    private String nom;
    private ObjectifCategorie categorie;
    private int score;

    public ObjectifPatient (String nom,ObjectifCategorie categorie){
        this.nom= nom;
        this.categorie= categorie;
    }

    public ObjectifPatient(String nom,ObjectifCategorie categorie,int score){
        this.nom=nom;
        this.categorie=categorie;
        this.score=score;
    }

    public String getNom(){
        return nom;
    }

    public ObjectifCategorie getCategorie(){
        return categorie;
    }

    public void setScore(int score){
        this.score=score;
    }

    public int getScore(){
        return score;
    }
}
