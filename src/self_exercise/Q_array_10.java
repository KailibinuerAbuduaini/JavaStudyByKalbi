package self_exercise;

public class Q_array_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 3, 2, 2, 2, 6, 7 };
		System.out.println(C(x));
	}

	public static String C(int[] c) {
		int count3 = 0;
		int count2 = 0;
		for (int i = 0; i < c.length ; i++) {
			if (c[i] == 2) {
				count2++;

			} else if (c[i] == 3) {
				count3++;
			}
		}

		if (count2 == 2 || count3 == 2) {
			return "true";
		}

		return "false";

	}
}
