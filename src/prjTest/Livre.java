package prjTest;

import java.util.List;

public class Livre extends Media{
	
	Genre genreL;
	String titre;
	String auteur;
	String editeur;
	int nbExemplaire;

	public Livre(String titre, String auteur, String editeur, Genre genreL, int nbExemplaire) {
		super(titre, auteur, editeur, nbExemplaire);
		this.genreL = genreL;
		this.titre = titre;
	}

	public Genre getGenreL() {		
		return genreL;
	}
	
	public void setGenreL(Genre genre) {
		this.genreL = genre;
	}
	
	public String toString() {		
		
		String phrase = "LIVRE : ";
		phrase = phrase + "\nTitre = "+this.titre;
		phrase = phrase + " \nAuteur = "+this.auteur;
		phrase = phrase + " \nEditeur = "+this.editeur;
		phrase = phrase + " \nGenre = "+this.genreL;
		phrase = phrase + " \nNombre d'exemplaire = "+this.nbExemplaire;
		return phrase;
	}

	@Override
	protected String getGenre() {
		return ("")+this.genreL;
	}
	
}
