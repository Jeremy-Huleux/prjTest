package prjTest;

public class Enum {

	public enum genre{
		Litt,//litterature
		Littjeun("Litterature jeunesse"),//litterature jeunesse
		Pol,//policier
		Ban,//Bande dessine
		Doc,//Documentaire
		Non;//non specifie
		private String nonKeTuVeu;
		public void unGenre(String nonKeTuVeu) {
			this.nonKeTuVeu = nonKeTuVeu;
		}
	}
	
	
	public String definition(genre var){
		String def = "";
		switch(var) {
			case Litt:
				def = "Litterature";
				break;
			case Littjeun:
				def = "Litterature	Jeunesse";
				break;
			case Pol:
				def = "Policier";
				break;
			case Ban:
				def = "Bande dessinee";
				break;
			case Doc:
				def = "Documentaire";
				break;
			case Non:
				def = "Non specfie";
				break;
			
		}
		
		return def;
	}
	public genre choix(String v) {
		genre var = genre.Non;
		switch(v) {
			case "Litterature":
				var = genre.Litt;
				break;
			case "Litt":
				var = genre.Litt;
				break;
			case "Litterature Jeunesse":
				var = genre.Littjeun;
				break;
			case "Littjeu":
				var = genre.Littjeun;
				break;
			case "Policier":
				var = genre.Pol;
				break;
			case "Pol":
				var = genre.Pol;
				break;
			case "Bande dessinee":
				var = genre.Ban;
				break;
			case "Ban":
				var = genre.Ban;
				break;
			case "Documentaire":
				var = genre.Doc;
				break;
			case "Doc":
				var = genre.Doc;
				break;
			case "":
				var = genre.Non;
				break;
			case "ns":
				var = genre.Non;
				break;
		}
		return var;
	}

}
