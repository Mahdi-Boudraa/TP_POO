package com.example.tppoo;

import java.util.List;
import java.util.ArrayList;

public class Ortho{
    private String nom;
    private String prenom;
    private String adress;
    private int tlph;
    private String email;
    private String motDePasse;

    private List<Patient> listePatient;
    private List<RendezVous> listeRendezVous;
    private List<Anamnese> listeAnamnese;
    private List<ExercicePatient> listeExercices;
    private List<Question> listeQuestions;
    private enum TestType{EXERCICE,QUESTIONNAIRE};

    public Ortho(String nom,String prenom,String adress,int tlph,String email, String motDePasse){
        this.nom=nom;
        this.prenom=prenom;
        this.adress=adress;
        this.tlph=tlph;
        this.email=email;
        this.motDePasse=motDePasse;
        this.listePatient = new ArrayList<>();
        this.listeRendezVous = new ArrayList<>();
        this.listeAnamnese = new ArrayList<>();
        this.listeExercices = new ArrayList<>();
        this.listeQuestions = new ArrayList<>();


    }

    public void ajouterPatient(Patient patient){

        listePatient.add(patient);
    }

    public Patient getPatient(int numDossier){
        for ( Patient pat : listePatient){
            if(pat.getPatientId()==numDossier){
                return pat;
            }
        }
        return null;
    }
    
    public void ajouterRendezVous(RendezVous rendezvous) {
        listeRendezVous.add(rendezvous);
        rendezvous.getPatient().getListRendezVous().add(rendezvous);
    }

    public void ajouterRendezVousConsultation(RendezVous rendezVous){
        listeRendezVous.add(rendezVous);
    }

    public void ajouterExercice(String nom,String consigne){

        ExercicePatient exercice = new ExercicePatient(consigne);
        listeExercices.add(exercice);

    }

    public void ajouterQuestion(String prompt, Categorie categorie, TypeQuestion type, List<String> options, List<String> repense){
        Question question = new Question(prompt, categorie, type, options, repense);
        listeQuestions.add(question);
    }

    public List<Patient> getPatients(){
        return listePatient;
    }

    public List<RendezVous> getListeRendezVous(){
        return listeRendezVous;
    }

    public List<Question> getListeQuestions(){
        return listeQuestions;
    }
    


}