package com.example.back;
import java.time.LocalDateTime;
public class Enfant extends Patient {
    private String classeEtude;
    private String numParent1;
    private String numParent2;

    public Enfant(Ortho orthophonist,String nom,String prenom, LocalDateTime dateNaissance,String LieuNaissance,String adresse,
                    String classeEtude,String numParent1,String numParent2){
        super(orthophonist,nom,prenom,  dateNaissance, LieuNaissance, adresse, false);
        this.classeEtude=classeEtude;
        this.numParent1=numParent1;
        this.numParent2=numParent2;

        
    }

    public Enfant(Ortho ortho,String nom,String prenom,int age){
        super(ortho,nom,prenom,age);
    }


    
}
