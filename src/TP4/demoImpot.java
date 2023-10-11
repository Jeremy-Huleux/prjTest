package TP4;

public class demoImpot {
	//static Habitation[] t;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Habitation h = new HabitationIndividuelle("Proprio test", "adresse test", 1000, 5, false);
		Habitation h2 = new HabitationProfessionnelle("ProprioPro", "adressePro", 10000, 500);
		ImpotLocal ht = new ImpotLocal(h);
		ht.tablo[0].afficher();
	}
 
}
