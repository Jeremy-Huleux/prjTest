package TP5;

public class InterfaceFleuriste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantite = 0;
		double prix = 0;
		String nomfleur = null;
		Fleur fleur1 = new Fleur(10, 2500, "rose");
		Fleur fleur2 = new Fleur(4, 500, "rose bleu");
		Fleur fleur3 = new Fleur(8, 52, "rose blanche");
		Stock stock1 = new Stock();
		stock1.ajoutStock(fleur3);
		stock1.ajoutStock(fleur2);
		stock1.ajoutStock(fleur1);
		System.out.println(stock1.quantiteStock("rose bleu"));
		Bouquet b1 = new Bouquet("Jeremy", "H");
		b1.creationBouquet(fleur1);
		b1.creationBouquet(fleur2);
		b1.creationBouquet(fleur3);
		System.out.println(b1);
		System.out.println(stock1.prixDuneFleur("rose"));
		stock1.ajoutFleur("rose", 25);
		System.out.println(stock1.quantiteStock("rose"));
		
		
	}



}
