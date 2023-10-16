package TP5;

import java.util.ArrayList;
import java.util.*;

public class Bouquet {
	String nom;
	String prenom;
	List<Fleur> bouquet = new ArrayList<Fleur>();
	ListIterator<Fleur> it = bouquet.listIterator();

	public Bouquet(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public void creationBouquet(Fleur fleur) {
		this.bouquet.add(fleur);
	}
	public String toString() {
		String strinje;
		strinje = "Nom client : "+this.nom;
		strinje = strinje + "\nPrenom client : "+this.prenom;
		for(int i = 1; i<this.bouquet.size(); i++) {
			strinje = strinje + "\n	NOM FLEUR "+i+" DU BOUKER : "+this.bouquet.get(i).nom;
			strinje = strinje + "\n	PRIX FLEUR "+i+" DU BOUKER : "+this.bouquet.get(i).prix;
		}
		return strinje;
	}
	


}
