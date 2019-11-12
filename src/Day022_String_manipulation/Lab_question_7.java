package Day022_String_manipulation;

public class Lab_question_7 {

	public static void main(String[] args) {
	
	
		
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
