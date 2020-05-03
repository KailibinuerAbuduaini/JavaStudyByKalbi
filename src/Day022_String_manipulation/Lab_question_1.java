package Day022_String_manipulation;

public class Lab_question_1 {

	public static void main(String[] args) {
		/*
		 * Create a method that accepts 1 string, e.g. "Bob", return a greeting of the
		 * form "Hello Bob!".
		 */

		System.out.println(helloName("kelly"));
	}

	public static String helloName(String name) {
		String greeting = "hello" + " " + name;

		return greeting;
	}
}
