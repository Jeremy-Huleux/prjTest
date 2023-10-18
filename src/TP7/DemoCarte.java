package TP7;

public class DemoCarte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joueur j1 = new Joueur("Jeremy");
		Joueur j2 = new Joueur("Tomas");
		Carte carte1 = new Carte(3, "pique", j1);
		Carte carte2 = new Carte("Coeur", "Roi", j2);
		Table t1 = new Table(carte1, carte2);
		System.out.println(t1);

	}

}
