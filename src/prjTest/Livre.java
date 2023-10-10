package prjTest;

public class Livre extends Media{
	
	Genre genreL;

	public Livre(String titre, String auteur, String editeur, Genre genreL, int nbExemplaire) {
		super(titre, auteur, editeur, nbExemplaire);
		this.genreL = genreL;
	}

	public Genre getGenre() {		
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String toString() {		
		
		String phrase = "\nTitre = "+this.titre;
		phrase = phrase + " \nAuteur = "+this.auteur;
		phrase = phrase + " \nEditeur = "+this.editeur;
		phrase = phrase + " \nGenre = "+this.genre;
		phrase = phrase + " \nNombre d'exemplaire = "+this.nbExemplaire;
		return phrase;
	}
	
}
