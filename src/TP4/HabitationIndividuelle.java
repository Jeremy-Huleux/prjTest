package TP4;

public class HabitationIndividuelle extends Habitation {
	int nbPieces;
	boolean piscine;
	double impotIndiv = 0;
	
	public HabitationIndividuelle(String proprietaire, String adresse, double surface,int nbPieces,boolean piscine) {
		super(proprietaire, adresse, surface);
		this.nbPieces = nbPieces;
		this.piscine = piscine;	
		//super.afficher();
	}
	
	public void impotIndiv() {
		impotIndiv = impotIndiv + this.nbPieces*100;
		if(piscine == true)impotIndiv = 500;
	}

	public void afficher() {
		super.afficher();
		System.out.println(nbPieces);
		System.out.println(piscine);
	}

}
