package TP4;
//public class ChoixV {
	public enum ChoixV {
		bus("PetiBus"),
		cit("Camion Citerne"),
		bach("Camion Bache");
		private String choixV;
		private ChoixV(String choix) {
			choixV = choix;
			// TODO Auto-generated constructor stub
		}
		public String getChoix() {
			return choixV;
		}
		public void setChoix(String choix) {
			this.choixV = choix;
		}
	}
//}
