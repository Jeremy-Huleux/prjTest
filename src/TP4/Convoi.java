package TP4;

public class Convoi {

	public Vehicule t[];
	public int vitesseMax;
	public int compteur = 0;
	public Convoi() {// ajoutVehicule
		this.t = new Vehicule[2];
		/*
		for(int l = 0; l<t.length-1; l++) {
			//System.out.println(t[l]);
			if(t[l] == null) {t[l] = v;}
		}
		int vitMin = Integer.MAX_VALUE;
		for(int i =0; i<t.length-1; i++ ) {
			if(t[i].vitesseMax < vitMin) {vitMin = t[i].vitesseMax;}
		}
		vitesseMax = vitMin;
		//this.t = t;*/
		
	}
	public void ajoutVehicule(Vehicule v) {
		boolean verif = false;
		for(int l = 0; l<t.length; l++) {
			if(verif == false) {
				if(t[l] == null) {t[l] = v; verif = true; compteur++;}
			}else {break;}
		}
		vitesseMax();
	}
	public void vitesseMax() {
		int vitMin = Integer.MAX_VALUE;
		for(int i =0; i<t.length-1; i++ ) {
			if(t[i].vitesseMax < vitMin) {vitMin = t[i].vitesseMax;}
		}
		vitesseMax = vitMin;
	}

	public String toString() {
		String strinje = "----------CONVOI----------";
		for(int k =0; k<t.length; k++) {
			strinje = strinje + "\n\nType de vehicule : "+ this.t[k].typeV;
			strinje = strinje + "\nImmat : "+ this.t[k].immat;
			strinje = strinje + "\nCharge du vehicue : "+ this.t[k].chargeVehicule;
			strinje = strinje + "\nCharge max : "+ this.t[k].chargemaximal;
			strinje = strinje + "\nPoid a vide : "+ this.t[k].poidsVide;			
		}
		strinje = strinje + "\n----------VITESSE MAX DU CONVOI----------";
		strinje = strinje + "\n" + vitesseMax;
		return strinje;
	}
	public float calculConso() {
		float calc = 0;
		int m = 0;
		for(int u = 0; u<t.length ; u++) {
			m = t[u].chargeVehicule + t[u].poidsVide;
			Utilitaires p = new Utilitaires();
			calc = calc + p.consommation(t[u].vitesseMax, m);
		}
		return calc;
	}
}
