package com.example.back;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Atelier extends RendezVous {
    private List<Integer> numPatients;
    private String thematique;

    public Atelier (Ortho orthophonist, List<Patient> listPatients,String thematique,LocalDateTime dateTime){
        super(orthophonist,listPatients,dateTime);
        this.numPatients = new ArrayList<>();
        for (Patient pat : listPatients){
            numPatients.add(pat.getPatientId());
        }
        this.thematique=thematique;
    }
}
