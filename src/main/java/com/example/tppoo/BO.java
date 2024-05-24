package com.example.tppoo;
import java.time.LocalDateTime;
import java.util.List;

public class BO {

    private Ortho ortho;
    private Patient patient;
    private Anamnese anamnese;
    private EpreuveClinique epreuvesClinique;
    private Diagnostic diagnostics;
    private ProjetTherapeutique projets;
    private String nom;
    private String prenom;
    private int age;

    public BO(Ortho ortho,Patient patient){
        this.ortho= ortho;
        this.patient = patient;


        patient.ajouterBO(this);

    }

    public BO(Ortho ortho,List<Question> questions, String nom, String prenom, int age){
        this.ortho= ortho;
        Anamnese anamnese1 = new Anamnese(questions,age);
        this.anamnese = anamnese1;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;

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
        this.patient.ajouterTrouble(troubl);
    }

    public void ajouterProjet(String projet){
        ProjetTherapeutique proj = new ProjetTherapeutique(projet);
        this.projets = proj;
    }

    public EpreuveClinique getEpreuvesClinique(){
        return epreuvesClinique;
    }

    public void prendreCharge(){
        Patient newPatient;
        if(age>=18) {
            newPatient = new Adulte(ortho, nom, prenom, age);

        }
        else{
            newPatient = new Enfant(ortho,nom,prenom,age);

        }

        patient = newPatient;
        patient.ajouterBO(this);
        patient.setAnamnese(anamnese);

    }


    
}
