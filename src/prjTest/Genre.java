package prjTest;

public enum Genre {

		Litt("Litterature"),//litterature
		Littjeun("Litterature jeunesse"),//litterature jeunesse
		Pol("Police"),//policier
		Ban("Bande dessinee"),//Bande dessine
		Doc("Documentaire"),//Documentaire
		Non("Non specifie"),
		;//non specifie
		private String nonKeTuVeu;
		private Genre(String nonKeTuVeu) {
			this.nonKeTuVeu = nonKeTuVeu;
		}
		public String getNonKeTuVeu() {
			return nonKeTuVeu;
		}

}
