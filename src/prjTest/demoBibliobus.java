package prjTest;

import java.util.Scanner;

public class demoBibliobus {

	public static void main(String[] args) {
		Bibliobus test = new Bibliobus();
		test.creaBibli("nom");
		test.ajoutLivre("Harry P", "JK", "coco");
		test.ajoutLivre("Harry P", "JK", "coco");
		test.ajoutLivre("Harry P", "JK", "coco");
		test.ajoutLivre("Harry P", "JK", "coco");
		test.ajoutLivre("Harry P", "JK", "coco");	
		test.afficherCatalogue();
	}

}
