package Day022_String_manipulation;

public class Lab_question_10 {

	public static void main(String[] args) {
		
System.out.println(frontAgain("edited"));
System.out.println(frontAgain("ed"));
System.out.println(frontAgain("edc"));
System.out.println(frontAgain("edit"));
	}
	public static boolean frontAgain(String n1) {
		
		String	first2=n1.substring(0,2);
		String  last2=n1.substring(n1.length()-2);
			
				return first2.equals(last2);
	}

}
