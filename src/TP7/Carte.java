package TP7;

public class Carte {
	int num;
	String forme;
	String perso;
	Joueur j;
	String[] tForm = {"Valet","Dame","Roi","As"};

	
	public Carte(int num, String forme, Joueur j) {
		this.num = num;
		this.forme = forme;
		this.perso = "";
		this.j = j;
	}
	public Carte(String forme, String perso, Joueur j) {
		this.num = 0;
		this.forme = forme;
		this.perso = perso;
		this.j = j;
	}
}
