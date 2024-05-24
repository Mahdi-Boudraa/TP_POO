package com.example.back;
import java.time.LocalDateTime;



public class Consultation extends RendezVous {
    private String nom;
    private String prenom;
    private int age;

    public Consultation(Ortho orthophonist,LocalDateTime dateTime, String observation, String nom,String prenom,int age){
        super(orthophonist,dateTime,observation);
        this.age=age;
        this.nom=nom;
        this.prenom=prenom;
        //if adult then it is 2h30 
        if(age>=18){
            super.setDuree("2h30");
        }
        else{
            super.setDuree("1h30");
        }
    }
    
}
