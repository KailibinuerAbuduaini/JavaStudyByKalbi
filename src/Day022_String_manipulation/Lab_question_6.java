package Day022_String_manipulation;

public class Lab_question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withoutEnd("hello");
		System.out.println(withoutEnd("hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
	}
public static String withoutEnd(String n1) {
	String b=n1.substring(1,n1.length()-1);
	return b;
}
}
