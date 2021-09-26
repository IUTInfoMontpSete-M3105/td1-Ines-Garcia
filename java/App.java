import java.util.*;

public class App{
	public static void main(String[] args) {
		Cours c = new Cours();
		Administrateur a = new Administrateur("Durand","Jean","8 rue de l'aiguillerie","yop@gmail.com");
		Etudiant e1 = new Etudiant("Garcia","Ines","1245 rue basse","oui@gmail.com",45688);
		Etudiant e2 = new Etudiant("Dinard","Jean-pierre","15 rue haute","non@gmail.com",95688);
		Enseignant e3 = new Enseignant("Foucault","Jean-pierre","5 rue droite","jp@gmail.com",434,489);
		Enseignant e4 = new Enseignant("Foucault","Nathalie","5 rue gauche","nf@gmail.com",465,484);
		Devoir d1 = new Devoir("Desvoir maison","A faire",21/05/2020,10);
		Devoir d2 = new Devoir("Devoir maison","A faire",25/05/2020,20);

		System.out.println(e1.uploadDocument());
		System.out.println(e3.creerDevoir());
		System.out.println(e3.noter());
	}
}