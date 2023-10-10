package prjTest;

public abstract class Media {

	private String titre;
	private String auteur;
	private String editeur;
	int nbExemplaire = 1;
	
	public Media(String titre, String auteur, String editeur, int nbExemplaire) {
		
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.nbExemplaire = nbExemplaire;
		
		
	}

	public int getNbExemplaire(Livre li) {
		
		return nbExemplaire;
	}
	public void perteExemplaire() {
		 nbExemplaire = nbExemplaire -1;		

	}
	public boolean estPresent() {
		boolean verif;
		verif = false;
			if(nbExemplaire > 0) {
				verif = true;
			}
		return verif;
	}
	public boolean equals(Livre li) {

		boolean yn = false;
		
		String getEdit = li.getEditeur();
		String getTit = li.getTitre();
		String getAu = li.getAuteur();
		
		if(getEdit == this.getEditeur() || getTit == this.getTitre() || getAu == this.getAuteur()) {
			yn = true;
		}
		return yn;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur.toUpperCase();
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre.toUpperCase();
	}	
	public int getNbExemplaire() {
		return nbExemplaire;
	}
	public void setNbExemplaire(int nbExemplaire) {
		this.nbExemplaire = nbExemplaire;
	}
	public String getAuteur() {
		return auteur;
	}
	public String getEditeur() {
		return editeur;
	}
	public int nouvelExemplaire() {
		nbExemplaire ++;
		return nbExemplaire;
	}
	public int nouvelExemplaire(int nb) {
		nbExemplaire = nb + nbExemplaire;
		return nbExemplaire;
	}/*
	public Livre nouvelEditeur(String editeur) {
		Livre livre2 = new Livre(this.titre, this.auteur, editeur, this.genre, this.nbExemplaire, this.nomCat);
		return livre2;
	}
	public String getNomCat() {
		return nomCat;
	}
*/

	protected abstract String getGenre();

}
