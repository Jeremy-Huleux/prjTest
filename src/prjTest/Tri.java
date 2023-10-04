package prjTest;
import java.util.Random;

public class Tri {
	public static int[] t1;//voir avec Atef pk static
	public int[] t2;
	public static int save;
	//public static int nbcase;
	public int rand;
	/**
	 * construct crea qui cree un tableau de nbcase nombre de case 
	 * le remplis de valeur aleatoire de 0 a 10
	 * @param nbcase
	 */

	//int value = random.nextInt(10);
public static void crea(int nbcase) {
	//nbcase = 10;
	for(int i = 0; i < nbcase; i++) {
		t1 = new int[nbcase];
				
		//rand = random.nextInt(10);
		Random random = new Random();//appelle du construct random dans l'import
		t1[i] = random.nextInt(10);
		System.out.println(t1[i]);
		//System.out.println(random.nextInt(10));
	}
}public static void main(String[] args) {
		int nbcas;
		nbcas = 10;
		
		crea(nbcas);
		for(int i = 0; i< nbcas-1; i++) {
			if(t1[i] > t1[i+1]) {
				save = t1[i+1];
				t1[i+1] = t1[i];
				t1[i] = save;
				System.out.println(t1[i]);
			}
		}
	}

}
