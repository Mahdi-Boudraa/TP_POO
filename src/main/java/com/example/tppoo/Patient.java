import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
public class Patient {
    private Ortho orthophonist;
    private int numPatient;
    private String nom;
    private String prenom;
    private LocalDateTime dateDeNaissance;
    private String lieuDeNaissance;
    private String adresse;
    private List<RendezVous> listeRendezVous;
    private List<BO> listeBO;
    private List<FicheDeSuivie> listeDesFichesDeSuivie;
    private Set<Trouble> listeTroubles;
    private FicheDeSuivie ficheDeSuivie;
    private Boolean isAdulte;
    private Boolean anamneseEffectuee;

    public Patient(Ortho orthophonist, String nom,String prenom, LocalDateTime dateNaissance,String LieuNaissance,String adresse,Boolean adulte){
        this.numPatient = generatePatientNumber();
        this.nom=nom;
        this.prenom=prenom;
        this.dateDeNaissance=dateNaissance;
        this.lieuDeNaissance=LieuNaissance;
        this.adresse=adresse;
        this.isAdulte=adulte;
        this.anamneseEffectuee=false;
        this.listeRendezVous = new ArrayList<>();
        this.listeBO = new ArrayList<>();
        this.listeDesFichesDeSuivie = new ArrayList<>();
        this.listeTroubles = new HashSet<>();
        this.orthophonist=orthophonist;
        orthophonist.ajouterPatient(this);

    }

    private int generatePatientNumber() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String formattedDate = now.format(formatter);
        Random random = new Random();
        int randomNumber = 100 + random.nextInt(900); // generates a random number between 100 and 999
        return Integer.parseInt(formattedDate + randomNumber);
    }

    public int getPatientId() {
        return numPatient;
    }
    public boolean getIsAdulte(){
        return isAdulte;
    }

    public void ajouterBO(BO bo){
        listeBO.add(bo);
    }

    public void supprimerBO(BO bo){
        listeBO.remove(bo);
    }

    public List<BO> getListeBO(){
        return listeBO;
    }

    public Boolean getAnamneseEffectuee(){
        return anamneseEffectuee;
    }

    public void setAnamneseEffectuee(Boolean anamneseEffectuee){
        this.anamneseEffectuee = anamneseEffectuee;
    }

    public void ajouterTrouble(Trouble trouble){
        this.listeTroubles.add(trouble);
    }

    public void ajouterRendezVous(RendezVous rendezvous){
        listeRendezVous.add(rendezvous);
    }

    public List<RendezVous> getListRendezVous(){
        return listeRendezVous;
    }
}
