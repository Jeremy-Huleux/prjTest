package TP4;

//import TP4.ChoixV.choixV;

public abstract class Vehicule {
	int poidsVide;
	int chargemaximal;
	int chargeVehicule;
	String immat;
	int vitesseMax;
	//ChoixV choix;
	String typeV;
	int poidTotal;
	public Vehicule(int chargeVehicule, String immat) {
		super();
		this.chargeVehicule = chargeVehicule;
		this.immat = immat;
		
	}
	public String afficher() {
		String sysout;
		sysout = "*******************************************************";
		sysout = sysout + "\nPoids a vide : ";
		sysout = sysout + poidsVide;
		sysout = sysout + "\nVitesse max : ";
		sysout = sysout + vitesseMax;
		sysout = sysout + "\nCharge max : ";
		sysout = sysout + chargemaximal;
		sysout = sysout + "\nCharge vehicule : ";
		sysout = sysout + chargeVehicule;
		sysout = sysout + "\nimmat : ";
		sysout = sysout + immat;
		sysout = sysout + "\nPoids Total : ";
		sysout = sysout + poidTotal;
		return sysout;
	}
	
}



//this.choix = choix;
/*	switch (choix) {
	case bus:
		this.chargemaximal = new PetiBus(choix, chargeVehicule, immat).chargemaximal;
		this.vitesseMax = new PetiBus(choix, chargeVehicule, immat).vitesseMax;
		this.poidsVide = new PetiBus(choix, chargeVehicule, immat).poidsVide;
		break;
	case cit:
		this.chargemaximal = new CamionCiterne(choix, chargeVehicule, immat).chargemaximal;
		this.vitesseMax = new CamionCiterne(choix, chargeVehicule, immat).vitesseMax;
		this.poidsVide = new CamionCiterne(choix, chargeVehicule, immat).poidsVide;
		break;
	case bach:
		this.chargemaximal = new CamionBache(choix, chargeVehicule, immat).chargemaximal;
		this.vitesseMax = new CamionBache(choix, chargeVehicule, immat).vitesseMax;
		this.poidsVide = new CamionBache(choix, chargeVehicule, immat).poidsVide;
		break;
}*/
