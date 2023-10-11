package TP4;

public abstract class Habitation {

	String proprietaire;
	String adresse;
	double surface;


	public double impot() {
		double impot;
		impot = this.surface*2;
		return impot;
	}
	
	public Habitation(String proprietaire, String adresse, double surface) {
		
		this.proprietaire = proprietaire;
		this.adresse = adresse;
		this.surface = surface;
	}
	
	
	public void afficher() {
		System.out.println(proprietaire);
		System.out.println(adresse);
		System.out.println(surface);
		
	}
	

}
