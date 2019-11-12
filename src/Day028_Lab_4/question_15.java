package Day028_Lab_4;

import java.util.Arrays;

public class question_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]z={4,2,4,7};
		System.out.println(Arrays.toString(arr(z)));
	}
	public static int[] arr(int[]a){
		int swap=a[0];
		a[0]= a[a.length-1];
		 a[a.length-1]=swap;
		return a;
	}

}
