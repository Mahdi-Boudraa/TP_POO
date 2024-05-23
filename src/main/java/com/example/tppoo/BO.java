package com.example.tppoo;
import java.util.List;

public class BO {

    private Patient patient;
    private Anamnese anamnese;
    private EpreuveClinique epreuvesClinique;
    private Diagnostic diagnostics;
    private ProjetTherapeutique projets;

    public BO(Patient patient){
        this.patient = patient;


        if (!patient.getAnamneseEffectuee()) {
            this.anamnese = new Anamnese(patient);
            patient.setAnamneseEffectuee(true);
        }
        patient.ajouterBO(this);

    }

    public void ajouterEpreuveClinique( List<Question> questions,List<Exercice> exercices){


        EpreuveClinique epreuve = new EpreuveClinique(patient, questions,exercices);
        this.epreuvesClinique = epreuve;
    }

    public void ajouterObservationEpreuve(String observation){
        ObservationClinique observationClinique = new ObservationClinique(observation);
        epreuvesClinique.setObservation(observationClinique);
    }


    public void ajouterDiagnostic(String nomTrouble, CategorieTrouble categorieTrouble){
        Trouble troubl = new Trouble(nomTrouble,categorieTrouble);
        Diagnostic diagno = new Diagnostic(troubl,patient);
        this.diagnostics = diagno;
    }

    public void ajouterProjet(String projet){
        ProjetTherapeutique proj = new ProjetTherapeutique(projet);
        this.projets = proj;
    }


    
}
