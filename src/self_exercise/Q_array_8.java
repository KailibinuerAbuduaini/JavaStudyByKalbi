package self_exercise;

public class Q_array_8 {

	public static void main(String[] args) {
		int[]x= {1,4,5};
		int[]y= {3,5,6};
		System.out.println(A(x));
		System.out.println(A(x));

	}
public static String A(int[] b) {
	for(int i=0;i<b.length;i++) {
		if(b[i]==2||b[i]==3) {
			return "true";
		}
	}
			return "false";
		
		
	
}
}
