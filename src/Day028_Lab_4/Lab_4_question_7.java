package Day028_Lab_4;

import java.util.Arrays;

public class Lab_4_question_7 {
	/*
	 * Write a method that accepts 2 arrays and prints the second array containing the first
       and last elements from the first array.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3 };
		int[] y = {};
		System.out.println(Arrays.toString(contain(x, y)));
	}

	public static int[] contain(int[] a, int[] b) {

		b = new int[2];
		b[0] = a[0];
		b[1] = a[a.length - 1];
		return b;
	}
}