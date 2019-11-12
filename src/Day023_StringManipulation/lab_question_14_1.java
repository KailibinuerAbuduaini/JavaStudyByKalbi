package Day023_StringManipulation;

public class lab_question_14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "oddsly"; // 4 6-2
		// oddy 2 4-2
		// ddd 1 3-2

		if (str.length() < 2) {
			System.out.println(false);
			return;
		}

		if (str.substring(str.length() - 2).equals("ly")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
