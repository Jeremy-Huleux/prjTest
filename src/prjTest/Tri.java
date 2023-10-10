package prjTest;
//import java.util.Random;

public class Tri {
	public static int[] t1;//voir avec Atef pk static
	public static int[] t2;
	public static int save;
	//public static int nbcase;
	public static int rand;
/*	public boolean verif;
	public static boolean veriffin;*/
	//public static int compteur;
	/**
	 * construct crea qui cree un tableau de nbcase nombre de case 
	 * le remplis de valeur aleatoire de 0 a 10
	 * @param nbcase
	 * @return 
	 */

	//int value = random.nextInt(10);
//public static int[] crea() {
	//nbcase = 10;
/*	for(int i = 0; i < nbcase; i++) {
		t1 = new int[nbcase];*/

		//rand = random.nextInt(10);
	/*	Random random = new Random();//appelle du construct random dans l'import
		t1[i] = random.nextInt(10);*/
		//System.out.println("cas : "+i+" dedans : " + t1[i]);
		//System.out.println(random.nextInt(10));
	/*	for (int k = 0; k < t1.length; k++) {
			System.out.println(t1[k]);
		}*/
		//return t1;
//	}
	//return t1;

public static void main(String[] args) {
	t1 = new int[5];
	t1[0] = 5;
	t1[1] = 4;
	t1[2] = 3;
	t1[3] = 2;
	t1[4] = 1;

			for (int j = 0; j < t1.length-1; j++) {
			
					if(t1[j] > t1[j+1]) {						
						save = t1[j+1];
						t1[j+1] = t1[j];
						t1[j] = save;
						j = 0;
						}
		}
		for (int k = 0; k < t1.length; k++) {
			System.out.println(t1[k]);
		}
		
	}

}
