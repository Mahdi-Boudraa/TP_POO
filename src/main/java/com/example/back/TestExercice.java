package com.example.back;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class TestExercice extends Test implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<ExercicePatient> listeExercices;

    public TestExercice(Patient patient,String nom,List<Exercice> exercices) {
        super(patient,nom);
        listeExercices = new ArrayList<>();
        for (Exercice exo: exercices){
            ExercicePatient exoPatient = new ExercicePatient(exo.getConsigne(),exo.getMateriel());
            listeExercices.add(exoPatient);
        }
    }

    public void ajouterExercice(ExercicePatient exercice){
        listeExercices.add(exercice);
    }

    public void supprimerExercice(ExercicePatient exercice){
        listeExercices.remove(exercice);
    }

    @Override
    public int calculerScoreTotal() {
        int total = 0;
        for (ExercicePatient exo:listeExercices) {
            total=+exo.getScore();
        }
        return total;
    }



    public List<ExercicePatient> getExercices() {
        return listeExercices;
    }
}
