package self_exercise;

import java.util.Arrays;

public class Q_array_9 {

	public static void main(String[] args) {
		int[]x= {1,2,3,4,5};
		System.out.println(Arrays.toString(B(x)));

	}
public static int[] B(int[]b) {
	int[]newArr=new int[2*b.length];
	newArr[newArr.length-1]=b[b.length-1];
	return newArr;
	
}
}
