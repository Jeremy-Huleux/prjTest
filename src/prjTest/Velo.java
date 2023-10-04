package prjTest;

public class Velo {
/** Cette classe modelise l'etat du velo d'un cyclite qui roule. */
	/** la vitesse actuel du velo */
	private int vitesse = 0;
	//private int la = 40;
	/** le cycliste accelere.
	 * 
	 * @param increment indique de ombien la vitesse du velo augmente.
	 */
	public int getVitesse() {
		return this.vitesse;
	}
	public void accelerer(int increment) {
		vitesse = vitesse + increment;
	}
	/** Le cycliste freine
	 * 
	 * @param decrement indique de combien la vitesse du velo baisse.
	 */
	public void freiner(int decrement) {
		vitesse = vitesse - decrement;
	}
	/** affiche l'etat du velo, i.e. sa vitesse. */
	public void imprimeEtat() {
		System.out.println("vitesse: " + getVitesse());
	}
	/** on boucle pour accelerer de x KM/H jusqua la */
	public void acceleration(int kmhincr, int la) {
		//private int depart = 0;
		vitesse = 0;
		while (vitesse < la) {
			vitesse = vitesse + kmhincr;
			System.out.println("vitesse: " + vitesse);
			
		}
		//System.out.println("vitesse: " + vitesse);
	}
	public void freinement(int kmhdecr, int lo) {
		while (vitesse > lo) {
			vitesse = vitesse - kmhdecr;
			System.out.println("vitesse: " + vitesse);
		}
	}
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	
}
