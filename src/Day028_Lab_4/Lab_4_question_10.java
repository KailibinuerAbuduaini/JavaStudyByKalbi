package Day028_Lab_4;

public class Lab_4_question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 2, 2, 2 };
		System.out.println(twice(x));
	}

	public static String twice(int[] a) {
		int count3 = 0;
		int count2 = 0;
		for (int i = 0; i < a.length ; i++) {
			if (a[i] == 3) {
				count3 ++;

			} else if (a[i] == 2) {
				count2++;
			}
		}

		if (count2 == 2 || count3 == 2) {
			return "true";
		}
			
		return "false";
		
}
}