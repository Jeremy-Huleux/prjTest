package TP7;

public class Joueur {
	String nom;
	int points;
	public Joueur(String nom) {
		this.nom = nom;
		this.points = 0;
	}
	public Joueur(String nom, int p) {
		this.nom = nom;
		this.points = p;
	}
	public void ajoutPoints(int p) {
		
		this.points = points + p;
	}
	
	

}
