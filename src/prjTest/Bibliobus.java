package prjTest;

import java.util.Scanner;

public class Bibliobus {
	public Livre[] tablo;
	public String name;
	private String titre;
	private String auteur;
	private String editeur;
	private Genre genre;
	private int nbExemplaires;
	private int nbCatalogue;
	private int placeDispo ;
	public Livre NULL;
	int compteur = 0;
	int compteurDex =0;
	
	public void creaBibli(String name){
		
		int taille = 200;
		Bibliobus nbCat = new Bibliobus();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la taille du catalogue : ");
		taille = sc.nextInt();
		nbCatalogue = taille;
		placeDispo = taille;
		this.tablo = new Livre[nbCatalogue];
		this.name = name;
	}
	public int getNbCatalogue() {
		return nbCatalogue;
	}
	public void setNbCatalogue(int nbCatalogue) {
		this.nbCatalogue = nbCatalogue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void ajoutLivre(String titre, String auteur, String editeur) {	//, Genre genre, int nb
	/*	genre = Genre.Non;
		nb = 1;*/
		String verifTit;
		String verifAut;
		String verifEdit;
		Boolean verif= false;
		//String verifGenre;
		int verifNb;
		if(nbCatalogue != 0) {			
			for(int l = 0; l<this.tablo.length-1; l++) {
				if(this.tablo[l] != NULL) {
					verifTit = this.tablo[l].getTitre();
					verifAut = this.tablo[l].getAuteur();
					verifEdit = this.tablo[l].getEditeur();
					verifNb = this.tablo[l].getNbExemplaire();
					if(verifTit == titre && verifAut == auteur && verifEdit == editeur) {
						verifNb++;
						this.tablo[l].setNbExemplaire(verifNb);
						System.out.println("EXEMPLAIRE AJOUTEEEEEEEEEEEEEEEEEE");
						verif = true;
					}
				}
			}
			if(verif == false) {
				nbCatalogue --;
				Livre ajout = new Livre(titre ,auteur ,editeur , Genre.Non, 1, this.getName());
				this.tablo[compteur] = ajout;
				compteur++;
			}
		}else {
			System.out.println("ERREUR : Plus de place !");
		}	
	}
	public int getPlaceDispo() {
		return placeDispo;
	}
	public void setPlaceDispo(int placeDispo) {
		this.placeDispo = placeDispo;
	}
	public void afficher() {
		for(int j = 0; j<=compteur-1; j++) {
			System.out.println(this.tablo[j]);
		}
	}
	public void afficherCatalogue() {
		name = this.getName();
		System.out.println("Nom du catalogue : "+name);
		for(int k = 0; k<=compteur-1; k++) {
			System.out.println("\nIdentifiant : "+k);
			System.out.println("\nCaracteristique : ");
			System.out.println(this.tablo[k]);
		}
	}
	public String getTitre(int id) {
		titre = this.tablo[id].getTitre();
		return titre;
	}
	public String getAuteur(int id) {
		auteur = this.tablo[id].getAuteur();
		return auteur;
	}
	public String getEditeur(int id) {
		editeur = this.tablo[id].getEditeur();
		return editeur;
	}
	public Genre getGenre(int id) {
		genre = this.tablo[id].getGenre();
		return genre;
	}
	public int getNbExemplaires(int id) {
		nbExemplaires = this.tablo[id].getNbExemplaire();
		return nbExemplaires;
	}
	public void afficheLivre(int id) {
		System.out.println("Pour identifiant : "+ id);
		System.out.println("\nTitre : "+this.tablo[id].getTitre());
		System.out.println("\nAuteur : "+this.tablo[id].getAuteur());
		System.out.println("\nGenre : "+this.tablo[id].getGenre());
		System.out.println("\nbExemplaire : "+this.tablo[id].getNbExemplaire());
		System.out.println("\nEditeur : "+this.tablo[id].getEditeur());
		
	}
	public void suppr(int id) {
		this.tablo[id] = NULL;
	}
	public int autDonne(String aut) {
		int nb = 0;
		for(int p = 0; p<this.tablo.length-1; p++) {
			if(this.tablo[p].getAuteur() == aut) {
				nb++;
			}
		}
		return nb;
	}
	public int genreDonne(Genre g) {
		int nb2 = 0;
		for(int y = 0; y<this.tablo.length-1; y++) {
			if(this.tablo[y].getGenre() == g) {
				nb2++;
			}
		}
		return nb2;
	}
	
}
	
