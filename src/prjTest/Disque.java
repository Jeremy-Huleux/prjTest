package prjTest;

import java.util.ArrayList;
import java.util.List;

public class Disque extends Media {

	String exception;
	private String titre;
	private String auteur;
	private String editeur;
	private List<String> listPiste = new ArrayList<>();
	//private String nomCat;
	GenreD genreD;
	int nbExemplaire = 1;
	
	public Disque(String titre, String auteur, String editeur, GenreD genreD, int nbExemplaire, List<String> listeP) {
		super(titre, auteur, editeur, nbExemplaire);
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.genreD = genreD;
		this.nbExemplaire = nbExemplaire;
		this.listPiste = listeP;
		
		
	}
	public Disque(String titre, String auteur, String editeur, GenreD genreD, int nbExemplaire) {
		super(titre, auteur, editeur, nbExemplaire);
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.genreD = genreD;
		this.nbExemplaire = nbExemplaire;
		this.listPiste = new ArrayList<String>();
	}

	public String toString() {		
		//String phrase = "Nom du Catalogue : "+this.nomCat;
		String phrase = "DISQUE : ";
		phrase = phrase + "\nTitre = "+this.titre;
		phrase = phrase + " \nAuteur = "+this.auteur;
		phrase = phrase + " \nEditeur = "+this.editeur;
		phrase = phrase + " \nGenre = "+this.genreD;
		phrase = phrase + " \nNombre d'exemplaire = "+this.nbExemplaire;
		return phrase;
	}
	public List<String> getListPiste() {
		return listPiste;
	}
	public void setListPiste(List<String> listPiste) {
		this.listPiste = listPiste;
	}
	@Override
	protected String getGenre() {
		return ("")+this.genreD;
	}
	




}
