package TP7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

	private List<Integer> lst = new ArrayList<Integer>();

	Random rand = new Random();

	

	public void remplir() {

		for(int i = 0; i < 13; i++) {

			lst.add(i);

		}

	}

	public void affiche() {

		for(int i = 1; i < lst.size(); i++) {

			System.out.println(lst.get(i));

		}

	}

	public void melangeT() {

 

		int min = 1;

		int max = 12;

		//int limite = 12;

		

		for(int i = 0; i<max; i++) {

			int value = rand.nextInt(lst.size() - min) + min;

			System.out.println(value);

			//this.melangeT.add(tChiffre.get(value));

			lst.remove(value);

			System.out.println("*************************");
			System.out.println("\nValeur : "+value);
			System.out.println("\n*************************");
			affiche();

		}

 

	}

	

}
