package self_exercise;

import java.util.Arrays;

public class Q_array_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]x= {1,2,3,4};
		int[]y= {};
		System.out.println(Arrays.toString(c(x,y)));
		
	}
public static int[] c(int[]a,int[]b) {
	b=new int[2];
	b[0]=a[0];
	b[1]=a[a.length-1];
	return b;
}
}
