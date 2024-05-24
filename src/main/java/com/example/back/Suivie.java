package com.example.back;

import java.time.LocalDateTime;

public class Suivie extends RendezVous{
    private int numDossier;
    private boolean presentiel;

    public Suivie(Ortho orthophonist,Patient patient,LocalDateTime dateTime, String observation, boolean presentiel){
        super(orthophonist,patient, dateTime, observation);
        this.numDossier = patient.getPatientId();
        this.presentiel=presentiel;
    }

    public Suivie(Ortho orthophonist, int numDossier,LocalDateTime dateTime, String observation, boolean presentiel ){
        super(orthophonist,null, dateTime, observation);
        Patient patient = orthophonist.getPatient(numDossier);
        super.setPatient(patient);
        this.numDossier=numDossier;
        this.presentiel=presentiel;
    }

    public int getNumDossier(){
        return numDossier;
    }

    public boolean isPresentiel(){
        return presentiel;
    }

    
}
