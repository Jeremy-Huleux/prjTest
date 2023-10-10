package prjTest;

public class TriParRechMin {
public static int[] t1;
public static int save;
public static int length;
	public static void main(String[] args) {
		t1 = new int[5];
		t1[0] = 45;
		t1[1] = 2;
		t1[2] = 60;
		t1[3] = 3;
		t1[4] = 5;
		length = t1.length-1;
				for (int j = 0; j < length; j++) {
				
						if(t1[j] > t1[length]) {						
							save = t1[j];
							t1[j] = t1[length];
							t1[length] = save;
							length--;
							j=0;
							}						
			}
			for (int k = 0; k < t1.length; k++) {
				System.out.println(t1[k]);
			}
			
		}

	}
