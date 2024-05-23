import java.time.LocalDateTime;

public class Adulte extends Patient{
    private String diplome;
    private String profession;
    private String numero;

    public Adulte(Ortho orthophonist, String nom,String prenom, LocalDateTime dateNaissance,String LieuNaissance,String adresse,String diplome,String profession,String numero){
        super(orthophonist,nom,prenom,  dateNaissance, LieuNaissance, adresse, true);
        this.diplome=diplome;
        this.profession=profession;
        this.numero=numero;
    }
    
}
