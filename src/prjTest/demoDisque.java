package prjTest;

public class demoDisque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Disque disque = new Disque("testT", "testA", "testE", GenreD.rock, 1);
		disque.getListPiste().add("morso1");
		System.out.println(disque);
		//Media livre = new Livre(null, null, null, null, 0);
	}

}
