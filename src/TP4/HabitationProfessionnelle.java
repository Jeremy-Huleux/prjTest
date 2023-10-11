package TP4;
	
public class HabitationProfessionnelle extends Habitation{
	double employes;
	double impoPro;
	public HabitationProfessionnelle(String proprietaire, String adresse, double surface, double employes) {
		super(proprietaire, adresse, surface);
		this.employes = employes;
		//super.afficher();
		// TODO Auto-generated constructor stub
	}
	public void calcEmpl() {
		double calcul =0;
		for(int i = 0; i<employes; i++) {
			for(int k = 0; k==10; k++) {
				calcul = calcul + 1000;
			}
		}
		impoPro = calcul;
	}
	public void afficherPro() {
		System.out.println(employes);
		this.calcEmpl();
		System.out.println(impoPro);
	}
	

}
