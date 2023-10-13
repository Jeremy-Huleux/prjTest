package TP4;

public class PetiBus extends Vehicule{
	
	public PetiBus(int chargeVehicule, String immat) {
		super(chargeVehicule, immat);
		//this.choix = choix;
		this.poidsVide = 4;
		this.chargemaximal = 0;
		this.vitesseMax = 150;
		this.immat = immat;
		this.chargeVehicule = chargeVehicule;
		this.typeV = "Petit Bus";
		this.poidTotal = chargeVehicule + poidsVide;
	}

}
