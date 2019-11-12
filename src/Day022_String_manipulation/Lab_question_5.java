package Day022_String_manipulation;

public class Lab_question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 firstHalf("woohoo");
		 firstHalf("");
		System.out.println(firstHalf("woohoo"));
		System.out.println(firstHalf("hellothere"));
	}
public static String firstHalf(String n1) {
	String b=n1.substring(0,n1.length()/2);
	return b;
}
}
