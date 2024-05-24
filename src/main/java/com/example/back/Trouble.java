package com.example.back;
public class Trouble {
    private String nom;
    private CategorieTrouble categorie;


    public Trouble(String nom, CategorieTrouble categorie){
        this.nom = nom;
        this.categorie = categorie;
    }

    public void setCategorie(CategorieTrouble categorie){
        this.categorie = categorie;
    }

    public String getNom(){
        return nom;
    }

    public CategorieTrouble getCategorie(){
        return categorie;
    }
}
