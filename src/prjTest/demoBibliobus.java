package prjTest;

import java.util.Scanner;

public class demoBibliobus {

	public static void main(String[] args) {
		Bibliobus test = new Bibliobus("nom", 10);
		Media livre = new Livre("donnéeL", "okL", "cunlivr", Genre.Ban, 1);
		Media disque = new Disque("DISK", "okDiSkE", "cundisk", GenreD.ns , 1);
		System.out.println(livre);
		System.out.println(disque);
	}

}
