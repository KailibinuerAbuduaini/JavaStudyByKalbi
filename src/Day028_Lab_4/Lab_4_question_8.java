package Day028_Lab_4;

import java.util.Arrays;

public class Lab_4_question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 2, 5 };
		System.out.println(accept(x));
	}

	public static boolean accept(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 2 || a[i] == 3) {
				return true;
			}

		}
		return false;
	}
}
