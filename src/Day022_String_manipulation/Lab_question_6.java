package Day022_String_manipulation;

public class Lab_question_6 {

	public static void main(String[] args) {
		
		/*
		 * Given a string, return a version without the first and last char, so
           "Hello" yields "ell". The string length will be at least 2.
		 */
		System.out.println(withoutEnd("hs"));
	
		System.out.println(withoutEnd("hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
	}
	
public static String withoutEnd(String n1) {
	
	
	if(n1.length()<=2) {
		return "invalid";
	}
	
	
	String b=n1.substring(1,n1.length()-1);
	return b;
}
	
}


