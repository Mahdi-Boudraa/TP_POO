package com.example.back;
import java.io.Serializable;


import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Ortho implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nom;
    private String prenom;
    private String adress;
    private String tlph;
    private String email;
    private String motDePasse;

    private List<Patient> listePatient;
    private List<RendezVous> listeRendezVous;
    private List<Anamnese> listeAnamnese;
    private List<Exercice> listeExercices;
    private List<Question> listeQuestions;
    private List<Objectif> listeObjectifs;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Ortho(String nom, String prenom, String adress, String tlph, String email, String motDePasse){
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
        this.listeObjectifs = new ArrayList<>();


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

    public void ajouterExercice(String consigne,String materiel){

        Exercice exercice = new Exercice(consigne,materiel);
        listeExercices.add(exercice);

    }

    public void ajouterExercice(String consigne){
        Exercice exercice = new Exercice(consigne);
        listeExercices.add(exercice);

    }

    public void ajouterQuestion(String prompt, Categorie categorie, TypeQuestion type, List<String> options, List<String> repense){
        Question question = new Question(prompt, categorie, type, options, repense);
        listeQuestions.add(question);
    }

    public void ajouterQuestion(String prompt, Categorie categorie, TypeQuestion type){
        Question question = new Question(prompt, categorie, type);
        listeQuestions.add(question);
    }


    public void ajouterObjectif(String nom, ObjectifCategorie categorie){
        Objectif obj = new Objectif(nom,categorie);
        listeObjectifs.add(obj);
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
    public List<Exercice> getListeExercices(){return listeExercices;}



    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlph() {
        return tlph;
    }

    public void setTlph(String tlph) {
        this.tlph = tlph;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}