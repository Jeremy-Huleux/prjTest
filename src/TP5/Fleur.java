package TP5;

import java.util.ArrayList;
import java.util.*;

public class Fleur {
	public float prix;
	public int quantitee;
	public String nom;

	public Fleur(float prix, int quantitee, String nom) {
		//super();
		this.prix = prix;
		this.quantitee = quantitee;
		this.nom = nom;
		
	}
	
	
	public double getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public int getQuantitee() {
		return quantitee;
	}


	public void setQuantitee(int quantitee) {
		this.quantitee = quantitee;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	public void ajoutQ(int q) {
		this.quantitee = quantitee+q;
	}


	
	


}

