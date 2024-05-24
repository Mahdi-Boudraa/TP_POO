package com.example.tppoo;
import java.util.List;
import java.util.ArrayList;
public class FicheDeSuivie {
    private List<ObjectifPatient> listeObjectifsPatient;
    private Patient patient;
    private Ortho ortho;

    public FicheDeSuivie(Ortho ortho,Patient patient,List<Objectif> listeObjectifs){
        this.ortho=ortho;
        listeObjectifsPatient = new ArrayList<>();
        for(Objectif obj : listeObjectifs){
            ObjectifPatient objPat= new ObjectifPatient(obj.getNom(),obj.getCategorie());
            listeObjectifsPatient.add(objPat);
        }
        patient.ajouteFicheDeSuivie(this);
        patient.setFicheDeSuivie(this);
    }
    
}
