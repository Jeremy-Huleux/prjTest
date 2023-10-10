package prjTest;

public class DemoTri {

	public static void main(String[] args) {
		Trii t = new Trii();
		int taille = t.lireTaille();
		// instanciation du tableau
		int[] tab = new int[taille];
		
		//System.out.println("La taille choisie : " + t.lireTaille());
		t.remplirTableau(tab, taille);
		//System.out.println("Tableau avant tri");
		//t.afficherTableau(tab, taille);
		t.triRechMin(tab, taille);
		//System.out.println("Tableau après tri");
		//t.afficherTableau(tab, taille);
	}

}
