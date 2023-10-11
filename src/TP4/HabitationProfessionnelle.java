package TP4;
	
public class HabitationProfessionnelle extends Habitation{
	int employes;
	double impoPro;
	
	public HabitationProfessionnelle(String proprietaire, String adresse, double surface, int employes) {
		super(proprietaire, adresse, surface);
		this.employes = employes;
	}
	public void calcEmpl() {
		int calcul =0;
		int k = 0;
		for(int i = 0; i<employes; i++) {
			k++;
			if(k==10) { calcul = calcul + 1000; k=0;}
		}
		impoPro = calcul;
	}
	
	public void afficher() {
		super.afficher();
		System.out.println(employes);
	}

}
