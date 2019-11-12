package Day022_String_manipulation;

public class Lab_question_9 {

	public static void main(String[] args) {
		
System.out.println(right2("hello"));
System.out.println(right2("java"));
	}
public static String right2(String n1) {
	String b = n1.substring(0, n1.length()-2);
	String c = n1.substring(n1.length()-2);
	String d = c + b;
	return d;
}

	
	

}
