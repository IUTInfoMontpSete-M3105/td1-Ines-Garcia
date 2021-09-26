import java.util.*;

public class Utilisateur {

    public String nom;

    public String prenom;

    private String adressepostale;

    private String adressemail;

   
    public Utilisateur(String n, String p, String adr, String adrm) {
        this.nom = n;
        this.prenom = p;
        this.adressepostale = adr;
        this.adressemail = adrm;

    }

    private void getnom() {
        return nom;
    }

    private void setnom(String n) {
        this.nom = n;
    }

    private void getprenom() {
        return prenom;
    }

    private void setprenom(String p) {
        this.prenom = p;
    }

    public void affichercours(void Cours) {
       System.out.println("J'affiche mon cours"); 
    }
}