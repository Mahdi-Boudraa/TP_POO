package com.example.tppoo;
import java.util.ArrayList;
import java.util.List;

public class Anamnese {
    private List<QuestionPatient> questions;

    public Anamnese(Patient patient) {
        this.questions = new ArrayList<>();
        if (patient.getIsAdulte()) {
            initializeAdultQuestions();
        } else {
            initializeChildQuestions();
        }
    }

    private void initializeAdultQuestions() {
        questions.add(new QuestionPatient("Describe your medical history.", Categorie.MEDICAL_HISTORY,TypeQuestion.LIBRE));
        questions.add(new QuestionPatient("Describe your medical follow-up.", Categorie.MEDICAL_FOLLOWUP,TypeQuestion.LIBRE));
        // Add more adult-specific questions here
    }

    private void initializeChildQuestions() {
        questions.add(new QuestionPatient("Describe the family structure.", Categorie.FAMILY_STRUCTURE,TypeQuestion.LIBRE));
        questions.add(new QuestionPatient("Describe the family dynamics.", Categorie.FAMILY_DYNAMICS,TypeQuestion.LIBRE));
        questions.add(new QuestionPatient("Describe the family history.", Categorie.FAMILY_HISTORY,TypeQuestion.LIBRE));
        questions.add(new QuestionPatient("Describe the birth conditions.", Categorie.BIRTH_CONDITIONS,TypeQuestion.LIBRE));
        questions.add(new QuestionPatient("Describe the psychomotor development.", Categorie.PSYCHOMOTOR_DEVELOPMENT,TypeQuestion.LIBRE));
        questions.add(new QuestionPatient("Describe the language development.", Categorie.LANGUAGE_DEVELOPMENT,TypeQuestion.LIBRE));
        questions.add(new QuestionPatient("Describe the character and behavior.", Categorie.CHARACTER_BEHAVIOR,TypeQuestion.LIBRE));
        // Add more child-specific questions here
    }

    public void supprimerAllQuestions(){
        questions.clear();
    }

    public List<QuestionPatient> getQuestions() {
        return questions;
    }

    public void ajouterQuestion(QuestionPatient question) {
        questions.add(question);
    }

    public void supprimerQuestion (QuestionPatient question){
        questions.remove(question);
    }
}
