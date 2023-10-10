package TP4;

public class HabitationIndividuelle extends Habitation {
	int nbPieces;
	boolean piscine;
	
	public HabitationIndividuelle(String proprietaire, String adresse, double surface,int nbPieces,boolean piscine) {
		super(proprietaire, adresse, surface);
		this.nbPieces = nbPieces;
		this.piscine = piscine;
		
	
		super.afficher();
		// TODO Auto-generated constructor stub
	}
	
	public double calculPiece() {
		double calcul;
		calcul = this.nbPieces*100;
		return calcul;
	}
	public double calculPiscine() {
		double calcul = 0;
		if(piscine == true)calcul = 500;
		return calcul;
	}
	

}
