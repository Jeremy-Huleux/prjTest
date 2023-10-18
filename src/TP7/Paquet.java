package TP7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Paquet {
	List<Carte> paquet = new ArrayList<Carte>();
	List<String> tPerso = Arrays.asList("Valet","Dame","Roi","As");
	List<String> tCouleur = Arrays.asList("Coeur", "Pique", "Treffle", "Carre");
	List<Integer> tChiffre = Arrays.asList(2,3,4,5,6,7,8,9,10);
	String nom;
	List<Integer> melangeT = new ArrayList<Integer>();
	
	public Paquet(String nom) {
		this.nom = nom;
	}

	public void melangeT() {
		int min = 1;
		int max = 9;
		Random rand = new Random();

		for(int i = 1; i<=max; i++) {
			int value = rand.nextInt(max + min) + min;
			this.melangeT.add(tChiffre.get(value));
			this.tChiffre.remove(this.tChiffre.get(value));

			}
		}
		
	
	
	public String toString() {
		String strinje = "";
		for(int l =0; l<=12; l++) {
			strinje = strinje + "Indice "+l;
			strinje = strinje + "\nValeur : "+melangeT.get(l);
			strinje = strinje +"\n***\n";
		}	
		return strinje;
	}
	

}
