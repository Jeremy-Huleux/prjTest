package prjTest;

public class Point {
/** abscisse du point */
	public int x = 0;
	/** Ordonnee du point */
	public int y = 0;
	
	/** On peut construire un point en donnant ses coordonnees." 
	* @param x absicesse du point
	* @param y ordonnee du point
	*/
	public Point(int unX, int unY) {
		x = unX;
		y = unY;
	}
	/** par defaut, le point construit est l'origine du repere. */
	public Point() {
		this(0, 0);
	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
