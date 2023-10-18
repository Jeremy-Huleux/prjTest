package TP7;

public class Table {
	String[] tPerso = {"Valet","Dame","Roi","As"};
	Carte carte1;
	Carte carte2;
	String gagneur;

	public Table(Carte carte1, Carte carte2) {
		this.carte1 = carte1;
		this.carte2 = carte2;
	}
	//2, 3, 4, 5, 6, 7, 8, 9, 10, valet, dame, roi, as, l'as étant le plus fort. 
	public boolean numCompCarte() { //return TRUE si c'est pas un num mais un perso (roi etc)
		boolean v = false;
		if(this.carte1.num == 0 && this.carte2.num ==0) {v = true;}
		return v;
	}
	public void formCompCarte() {
		int numC1 = 0;
		int numC2 = 0;
			for(int i = 0; i<tPerso.length-1; i++) {
				if(tPerso[i] == this.carte1.perso) {numC1 = i;}
				if(tPerso[i] == this.carte2.perso) {numC2 = i;}
		}
		if(numC1 < numC2) {
			this.carte2.j.ajoutPoints(2);
			this.gagneur = this.carte2.j.nom;
		}else {
			if(numC1 > numC2) {
				this.carte1.j.ajoutPoints(2);
				this.gagneur = this.carte1.j.nom;
			}else {
				if(numC1 == numC2) {
					this.carte1.j.ajoutPoints(1);
					this.carte2.j.ajoutPoints(1);
					
				}
			}
		}
			
	}
	public void ajoutPointsNum() {
		if(carte1.num < carte2.num) {
			this.carte2.j.ajoutPoints(2);
			this.gagneur = this.carte2.j.nom;
		}else {
			if(carte1.num > carte2.num) {
				this.carte1.j.ajoutPoints(2);
				this.gagneur = this.carte1.j.nom;
			}else {
				if(carte1.num == carte2.num) {
					this.carte1.j.ajoutPoints(1);
					this.carte2.j.ajoutPoints(1);
				}
			}
		}
	}
	public boolean compareTetNum() { //retourne true si la gagneur est deja defini par le fait que tête > chiffre
		boolean bool = false;
		if(this.carte1.num == 0 && this.carte2.num > 1) {
			bool = true;
			}else {
				if(this.carte2.num == 0 && this.carte1.num > 1) {	
					bool = true;
					}
			}
		return bool;
	}
	public void ajoutPointTetNum() {
		if(this.carte1.num == 0 && this.carte2.num > 1) {
			this.carte1.j.ajoutPoints(2);
			this.gagneur = this.carte1.j.nom;
			
			}else {
				if(this.carte2.num == 0 && this.carte1.num > 1) {
					this.carte2.j.ajoutPoints(2);
					this.gagneur = this.carte2.j.nom;
					
					}
			}
	}
	public void forceCarte() {
		// la plus forte gagne deux points. Si les cartes ont le meme rang, chacun de joueurs recoit un point
		boolean v;
		v = this.numCompCarte();
		boolean v2;
		v2 = this.compareTetNum();
		if(v == true) {this.formCompCarte();}
		if(v2 == true) {this.ajoutPointTetNum();}
		if(v == false && v2 == false) {this.ajoutPointsNum();}
	}
	
	public String toString() {
		String strinje;
		strinje ="Sur la table :";
		strinje = strinje + "\nCarte joueur 1 :";
		if(this.carte1.num > 1) {strinje = strinje + "\n"+this.carte1.num+" de "+this.carte1.forme;}else {
			strinje = strinje + "\n"+this.carte1.perso+" de "+this.carte1.forme;
		}
		strinje = strinje + "\nCarte joueur 2 :";
		if(this.carte2.num > 1) {strinje = strinje + "\n"+this.carte2.num+" de "+this.carte2.forme;}else {
			strinje = strinje + "\n"+this.carte2.perso+" de "+this.carte2.forme;
		}
		strinje = strinje + "\nGAGNEUR : "+this.gagneur;
		return strinje;
	}

}
