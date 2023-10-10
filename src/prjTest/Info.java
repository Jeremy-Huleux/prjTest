package prjTest;


import java.util.Scanner;


public class Info {
	public String[][] informations;
	public int nbCase;
	//public int cases;
	/*public char[] creaLigne(char a, char b, char c, char d, char e) {
		//informations = new char[informations.length+1];
		//return informations;
	}*/
	public int taille() {
		int t = 0;
		System.out.println("Entrez le nombre de bouquins SVPPTDR : ");
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		System.out.println("vous avez choisis : "+ t);
		nbCase = t;
		return t;
		}
	public String[][] creaTableau(int cases) {
		//informations = new char[cases][5];
		if(cases>0) {
		informations = new String[cases][5];
		
		for(int i = 0; i<cases; i++) {
			
			String a;
			String b;
			String c;
			String d;
			String e;
			//demander utilisateur : auteur editeur nombre d'exemplaire, genre
			//case [][0] = titre
			//case [][1] = auteur
			//case [][2] = editeur
			//case [][3] = nombres d'exemplaire
			//case [][4] = genre
			int r = i+1;
			System.out.println("Titre du livre numéro "+r+" : ");
			Scanner sc2 = new Scanner(System.in);
			a = sc2.next();
			informations[i][0] = a;
			System.out.println("Auteur du livre numéro "+r+" : ");
			Scanner sc3 = new Scanner(System.in);
			b = sc3.next();
			informations[i][1] = b;
			System.out.println("Editeur du livre numéro "+r+" : ");
			Scanner sc4 = new Scanner(System.in);
			c = sc4.next();
			informations[i][2] = c;
			System.out.println("Nombre d'exemplaire du livre numéro "+r+" : ");
			Scanner sc5 = new Scanner(System.in);
			d = sc5.next();
			informations[i][3] = d;
			System.out.println("Genre du livre numéro "+r+" : ");
			Scanner sc6 = new Scanner(System.in);
			e = sc6.next();
			informations[i][4] = e;
			
				
		}
		
		}
		else 
			System.out.println("Nombre positif SVP");
		return informations;
	}
	public void afficherT(String[][] informations) {
		//nbCase = informations.length;
		for(int i = 0; i<nbCase; i++) {
			//System.out.println("entréefor");
			int r2 = i+1;
			System.out.println("Le livre numéro "+r2+" :");
			for(int j = 0; j<4; j++) {
				switch (j) {
					case 0 :
						System.out.println("Titre : "+informations[i][j]); break; 
					case 1 :
						System.out.println("Auteur : "+informations[i][j]); break;  
					case 2 :
						System.out.println("Editeur : "+informations[i][j]); break;  
					case 3 :
						System.out.println("Nombre d'exemplaire : "+informations[i][j]); break;  
					case 4 :
						System.out.println("Genre : "+informations[i][j]); break;  
				}
			}
		}
	}
}



