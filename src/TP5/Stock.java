package TP5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Stock {
	List<Fleur> stock = new ArrayList<Fleur>();
	ListIterator<Fleur> it = stock.listIterator();

	public int quantiteStock(String nom) {
		for(int i = 0; i<stock.size(); i++) {
			if(this.stock.get(i).nom  == nom) {return this.stock.get(i).quantitee;}
		}return 0;
	}
	public List<Fleur> getStock() {
		return stock;
	}

	public void ajoutStock(Fleur fleur) {
		this.stock.add(fleur);
	}
	public float prixDuneFleur(String nom) {
		float prix = 0;
		for(int k = 0; k<stock.size(); k++) {
			if(this.stock.get(k).nom == nom) {prix = this.stock.get(k).prix;}
		}
		return prix;
	}
	public void ajoutFleur(String nom, int nb) {
		for(int y = 0; y<stock.size(); y++) {
			//System.out.println("1");
			if(this.stock.get(y).nom == nom) { this.stock.get(y).ajoutQ(nb);}
		}
	}
}
