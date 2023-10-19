package TP7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Paquet {
	List<Carte> paquet = new ArrayList<Carte>();
	List<String> tPerso = new ArrayList<String>();
	List<String> tCouleur = new ArrayList<String>();;
	List<Integer> tChiffre = new ArrayList<Integer>();;
	String nom;
	List<Integer> melangeT = new ArrayList<Integer>();
	
	public Paquet(String nom) {
		this.nom = nom;
		tPerso = Arrays.asList("Valet","Dame","Roi","As");
		tCouleur = Arrays.asList("Coeur", "Pique", "Treffle", "Carre");
		tChiffre = Arrays.asList(2,3,4,5,6,7,8,9,10);

	}

	public void melangeT() {
		int min = 1;
		int max = 9;
		
		Random rand = new Random();

		for(int i = 1; i<=max; i++) {
			int value = rand.nextInt(this.tChiffre.size() - min) + min;
			System.out.println(value);
			this.melangeT.add(this.tChiffre.get(value));
			this.tChiffre.remove(this.tChiffre.get(value));

			}
		}
		
	public void affiche() {
		//System.out.println("ok");
		for(int i = 0; i < tChiffre.size(); i++) {

			System.out.println(tChiffre.get(i));

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
