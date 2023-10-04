package prjTest;

public class DemoVelo {
/** Classe de tests pour la classe @class Velo */
	
	public static void main(String[] args) {
		// Genere deux objets differents du type Velo
		Velo velo1 = new Velo();
		Velo velo2 = new Velo();
		
		velo2.acceleration(10, 100);
		velo2.freinement(10, 0);
		// Invoque les methodes
		velo1.accelerer(10);
		velo1.imprimeEtat();
		/*velo2.accelerer(20);
		velo2.imprimeEtat();*/
		

	}

}
