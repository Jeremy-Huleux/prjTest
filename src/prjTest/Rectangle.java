package prjTest;

public class Rectangle {
	private Point origine;
	private int largeur = 0;
	private int hauteur = 0;
	private int perimetre = 0;
	private int surface = 0;
	
	public Rectangle(Point p, int l, int h) {
		origine = p;
		System.out.println(p.x);
		System.out.println(p.y);
		largeur = l;
		System.out.println(l);
		hauteur = h;
		System.out.println(h);
		perimetre = l + h;
		System.out.println(perimetre);
		surface = l * h;
		System.out.println(surface);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
