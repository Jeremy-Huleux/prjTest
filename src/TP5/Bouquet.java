package TP5;

import java.util.ArrayList;
import java.util.*;

public class Bouquet {
	String nom;
	String prenom;
	float prixB;
	List<Fleur> bouquet = new ArrayList<Fleur>();


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
	public void facturation() {
		for(int u = 0; u<bouquet.size(); u++) {
			prixB = prixB + this.bouquet.get(u).prix;
		}
	}


}
