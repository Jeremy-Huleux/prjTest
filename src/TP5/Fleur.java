package TP5;

import java.util.ArrayList;
import java.util.List;

public class Fleur {
	public double prix;
	public int quantitee;
	public String nom;
	List<Fleur> Stock = new ArrayList<Fleur>();
	
	public Fleur(double prix, int quantitee, String nom) {
		//super();
		this.prix = prix;
		this.quantitee = quantitee;
		this.nom = nom;
	}
	
	
	public void ajoutStock(Fleur fleur) {
		Stock.add(fleur);
	}
	
	
	public void quantiteStock(String nom) {
		
	}
	


}
