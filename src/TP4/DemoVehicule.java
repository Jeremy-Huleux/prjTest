package TP4;

public class DemoVehicule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicule v1 = new CamionBache(12, "AF-456-DF");
		//System.out.println(ChoixV.bus.getChoix());
		Vehicule v2 = new CamionBache(2, "LO-159-QE");
		//System.out.println(v1.toString());
		//System.out.println(v2.toString());
		Vehicule v1 = new CamionBache(8, "AF-456-DF");
	    //System.out.println(v1.getClass());
	    Convoi c = new Convoi();
	    c.ajoutVehicule(v1);
	    c.ajoutVehicule(v2);
	    System.out.println(c.toString());
	    int poid = v1.poidsVide+v1.chargeVehicule;
	    Utilitaires conso = new Utilitaires();
	    System.out.println(c.calculConso());
	    System.out.println(c.compteur);
	}

}
