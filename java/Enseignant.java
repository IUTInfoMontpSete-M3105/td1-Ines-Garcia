import java.util.*;

public class Enseignant extends Utilisateur {

    private int numem;
    private int harpege;

    public Enseignant(String nom, String prenom, String adressepostale, String adressemail, int numem, int harpege) {
        super(nom,prenom,adressepostale,adressemail);
        this.numem = numem;
        this.harpege = harpege;
    }

    private void getnumem(){
        return this.numem;
    }

    private void setnumem(int n){
        this.numem = n;
    }

    private void getharpege(){
        return this.harpege;
    }

    private void setharpege(int h){
        this.harpege = h;
    }

    public Devoir creerDevoir(void Cours) {
       System.out.println("Je crée un devoir pour mes étudiants");
    }

    public void noter(void Rendu) {
        System.out.println("Je note un rendu");
    }
}
