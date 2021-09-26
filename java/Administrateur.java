
import java.util.*;

public class Administrateur extends Utilisateur {

    public Administrateur(String nom, String prenom, String adressepostale, String adressemail) {
        super(nom,prenom,adressepostale,adressemail);
    }

    public Cours creercours(void Enseignant) {
        System.out.println("je crée un cours");
    }
}