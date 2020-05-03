package Day022_String_manipulation;

public class Lab_question_7 {

	public static void main(String[] args) {
	
	/*
	 * Given 2 strings, a and b, return a string of the form short+long+short,
       with the shorter string on the outside and the longer string on the
       inside
	 */
		
		System.out.println(comboString("aaa","b"));
		System.out.println(comboString("hi","Hello"));
		
	}
public static String comboString(String n1,String n2) {
	
	if (n1.length()<n2.length()) {
		String a=n1+n2+n1;
		return a;
		
	}else{
		
		String b=n2+n1+n2;
		
		return b;
	}
}
}
