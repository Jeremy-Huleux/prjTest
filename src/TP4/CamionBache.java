package TP4;

public class CamionBache extends Vehicule{

	
	public CamionBache(int chargeVehicule, String immat) {
		super(chargeVehicule, immat);
		//this.choix = choix;
		this.poidsVide = 4;
		this.chargemaximal = 20;
		this.vitesseMax = calculVitesse(chargeVehicule);
		this.immat = immat;
		this.chargeVehicule = chargeVehicule;
		this.typeV = "Camion Bache";
		this.poidTotal = chargeVehicule + poidsVide;
	}

	public int calculVitesse(int charge) {
		int result = 0;
		if(charge == 0) {result = 130;}
		if(charge <= 3) {result = 110;}
		if(charge > 3 && charge<7) {result = 90;}
		if(charge > 7) {result = 80;}
		return result;
	}
}
