package prjTest;

class Plan200 {
	int x = 9;
	int y = 7;
	public Plan200(int a, int b) {
		x = a;
		y = b;		
	}
	public void afficher() {
		System.out.println(x + y);
	}
}
public class Plan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plan200 p = new Plan200(3,4);
		p.afficher();
		//System.out.println("Hello World !!!!!");
	}
}