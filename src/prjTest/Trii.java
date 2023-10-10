package prjTest;

import java.util.Scanner;

public class Trii {
	
	public int lireTaille() {
		int taille = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la taille du tableau : ");
		taille = sc.nextInt();
		return taille;
	}
	public void remplirTableau(int[] t, int n) {
		for(int i = 0; i < n; i++) {
			t[i] = (int) Math.ceil(Math.random() * 100);
		}
	}
	public void afficherTableau(int[] t, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(t[i]);
		}
	}
	public void triBulle(int[] t, int n) {
		int tmp;
		boolean trier = false;
		while(trier == false) { // !trier equivalent trier == false
			// trier mis à true pour garantir la sortie de la boucle while
			trier = true;
			for(int i = 0; i < n-1; i++) {
				if(t[i] > t[i+1]) {
					tmp = t[i];
					t[i] = t[i+1];
					t[i+1] = tmp;
					// Le tableau n'est pas encore trier 
					trier = false;
				}
			}
		}
		
	}
	public void triRechMin(int[] t, int n) {
		int minValeur;
		//int indiceMin = 0;
		for(int j = 0; j < n; j++) {
			//
			//System.out.println(j);
			minValeur = Integer.MAX_VALUE;//integer.MAX_VALUE est egal a la plus grande valeur 
										//qui puisse exister dans un INT
			//une fois la plus petite valeur trouvé on recommence avec la deuxieme case de j 
			//on recherche la plus petite valeur entre j+1 et derniere case 
			//j etant la case deja remplis de la plus petite valeur existante du tableau
			for(int i = j; i < n; i++) {
				if(t[i] < minValeur) {//boucle cherchant la plus petite valeur dans le tableau
					//une fois une valeur mini trouvé elle est mise dans minvaleur 
					//(trouvera la plus etite valeur du tableau)
					// à chaque minimum trouvé je dois faire une permutation
					minValeur = t[i];
				//	System.out.println("j = "+j);
				//	System.out.println("i = "+i);
					//indiceMin = i;
					t[i] = t[j];
					t[j] = minValeur;//mets la plus petite valeur trouver dans tout le tableau 
					//dans t[j]
				}
			}
		}
	}
}
