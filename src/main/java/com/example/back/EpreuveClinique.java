package com.example.back;
import java.io.Serializable;
import java.util.List;

public class EpreuveClinique implements Serializable {
    private static final long serialVersionUID = 1L;

    private Patient patient;
    private ObservationClinique observations;
    private TestQuestionnaire testQuest;
    private TestExercice testExo;
    private int Score;

    public EpreuveClinique(Patient patient, List<Question> questions, List<Exercice> exercices){
        this.patient = patient;
        testQuest = new TestQuestionnaire(patient, null, questions);
        testExo = new TestExercice(patient, null, exercices);


    }

    public void setObservation(ObservationClinique obs){
        this.observations = obs;
    }
//change this one asap
    public int getScore(){
        return 0;
    }

    public TestQuestionnaire getTestQuest(){
        return testQuest;
    }

    
}
