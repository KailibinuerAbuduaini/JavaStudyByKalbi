package Day022_String_manipulation;

public class Lab_question_8 {

	public static void main(String[] args) {
		/*
		 * Given a string, return a "rotated left 2" version where the first 2 chars
           are moved to the end. The string length will be at least 2.
		 */

		System.out.println(left2("hello"));
	}

	public static String left2(String n1) {
		String b = n1.substring(0, 2);
		String c = n1.substring(2);
		String d = c + b;
		return d;

	}
}
//	 n1.substring(2).concat(n1.substring(0,2));