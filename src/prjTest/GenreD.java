package prjTest;

public enum GenreD {
	clas("Classique"),
	ja("Jazz"),
	mus("Musique du monde"),
	rock("Rock"),
	pop("Pop"),
	chan("Chanson Francaise"),
	ns("Non Specifie")
	;
	private String nonKeTuVeuD;
	private GenreD(String nonKeTuVeuD) {
		this.nonKeTuVeuD = nonKeTuVeuD;
	}
	public String getNonKeTuVeuD() {
		return nonKeTuVeuD;
	}
}
