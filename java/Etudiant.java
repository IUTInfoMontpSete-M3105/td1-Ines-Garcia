import java.util.*;

public class Etudiant extends Utilisateur {

    private int ine;

    public Etudiant(String nom, String prenom, String adressepostale, String adressemail,int ine) {
        super(nom,prenom,adressepostale,adressemail);
        this.INE = ine;
    }
    
    private void getINE(){
        return this.ine;
    }


    public void getDevoir(String nom) {
        System.out.println("Je récupère mon devoir");
    }

    public void creerRendu() {
        System.out.println("Je crée mon rendu");
    }

    public void uploadDocument() {
        System.out.println("J'upload mon document");
    }
}