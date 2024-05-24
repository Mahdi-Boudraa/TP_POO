package com.example.back;
import java.util.Set;
import java.util.HashSet;


public class Diagnostic {
    private Patient patient;
    private Set<Trouble> troubles;

    public Diagnostic(Trouble trouble,Patient patient){
        this.troubles = new HashSet<>();
        this.troubles.add(trouble);
        this.patient=patient;
        patient.ajouterTrouble(trouble);
    }

    public void ajouterTrouble(Trouble trouble){
        this.troubles.add(trouble);
        patient.ajouterTrouble(trouble);
    }

    public void supprimerTrouble(Trouble trouble){
        this.troubles.remove(trouble);
    }

    public Set<Trouble> getTroubles(){
        return troubles;
    }

}
