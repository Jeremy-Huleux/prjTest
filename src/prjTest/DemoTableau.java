package prjTest;

public class DemoTableau {

	public static void main(String[] args) {
		// Declaration
		int[] unTableau;
		
		//allocation memoire
		unTableau = new int[3];
		
		//initialisation
		unTableau[0] = 100;
		unTableau[1] = 200;
		unTableau[2] = 300;
		
		for (int i = 0; i < unTableau.length; i++) {
			System.out.println("Element "+i+" : " + unTableau[i]);
		}
		
		String[][] noms = {{"Mr. ", "Mrs. ", "Ms. "}, {"Smith", "Jones"}};
		
		System.out.println(noms[0][2] + noms[1][0]);
		System.out.println(noms[0][2] + noms[1][1]);
		for (int i = 0; i < noms.length; i++) {
			for(int j = 0; j < noms[i].length; j++) {
				System.out.println("Indices "+i+", "+j+" : "+noms[i][j]);
			}
		}
	}

}
