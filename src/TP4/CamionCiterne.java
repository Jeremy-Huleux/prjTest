package TP4;

public class CamionCiterne extends Vehicule{

	public CamionCiterne(int chargeVehicule, String immat) {
		super(chargeVehicule, immat);
		//this.choix = choix;
		this.poidsVide = 3;
		this.chargemaximal = 10;
		this.vitesseMax = 130;
		this.immat = immat;
		this.chargeVehicule = calculVitesse(chargeVehicule);
		this.typeV = "Camion Citerne";
		this.poidTotal = chargeVehicule + poidsVide;
	}
/*
130 km/h si la charge est nulle
110 km/h si la charge est inférieure ou égale à 1 tonne
90 km/h si la charge est supérieure à 1 tonne et inférieure ou égale à 4 tonnes
80 km/h pour une charge supérieure à 4 tonnes.
 */

public int calculVitesse(int charge) {
	int result = 0;
	if(charge == 0) {result = 130;}
	if(charge <= 3) {result = 110;}
	if(charge > 3 && charge<7) {result = 90;}
	if(charge > 7) {result = 80;}
	return result;
}
	

}
