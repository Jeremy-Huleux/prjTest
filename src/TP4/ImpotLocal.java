package TP4;


public class ImpotLocal {
	Habitation[] tablo;
	

	public ImpotLocal(Habitation h) {
		//super();
		for(int i = 0; i<tablo.length-1; i++) {
			if(tablo[i] == null) {tablo[i] = h; break;}
		}	
		
	}




}
