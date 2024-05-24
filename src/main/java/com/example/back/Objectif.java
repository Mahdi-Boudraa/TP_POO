package com.example.back;
public class Objectif {
    private String nom;
    private ObjectifCategorie categorie;

    public Objectif (String nom,ObjectifCategorie categorie){
        this.nom= nom;
        this.categorie= categorie;
    }

    public String getNom(){
        return nom;
    }

    public ObjectifCategorie getCategorie(){
        return categorie;
    }

}
