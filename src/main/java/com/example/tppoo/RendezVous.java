import java.time.LocalDateTime;

public class RendezVous {
    
    private Ortho orthophonist;
    private Patient patient;
    private LocalDateTime dateTime;
    private String Duree;
    private String observation;


    public RendezVous(Ortho orthophonist,Patient patient,LocalDateTime dateTime, String observation){
        this.orthophonist=orthophonist;
        this.patient = patient;
        this.dateTime=dateTime;
        this.Duree="1h";
        this.observation=observation;
        orthophonist.ajouterRendezVous(this);
    }

    public RendezVous(Ortho orthophonist,LocalDateTime dateTime, String observation){
        this.orthophonist=orthophonist;
        this.dateTime=dateTime;
        this.observation=observation;
        orthophonist.ajouterRendezVous(this);

    }

    public RendezVous(Ortho orthophonist,LocalDateTime dateTime){

        this.orthophonist=orthophonist;
        this.dateTime=dateTime;
        orthophonist.ajouterRendezVous(this);
    }

    public void setDuree(String duree){
        this.Duree=duree;
    }

    public void setPatient(Patient patient){
        this.patient=patient;
    }

    public void setObservation(String observation){
        this.observation=observation;
    }

    public Patient getPatient(){
        return patient;
    }

}
