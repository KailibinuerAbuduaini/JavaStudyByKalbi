package Day028_Lab_4;

public class question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 1, 2, 3 };
		int[] y = { 1, 4, 5 };
		System.out.println(check(x, y));
	}

	public static int check(int[] a, int[] b) {
		int counta = 0;

		if (a[0] == 1) {
			counta++;
		}

		if (b[0] == 1) {
			counta++;
		}
		return counta;
	}

}
