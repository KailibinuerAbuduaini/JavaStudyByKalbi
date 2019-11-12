package Day022_String_manipulation;

public class Lab_question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeAbba("Hi","Bye");
		System.out.println(makeAbba("Hi","Bye"));
	}
public static String makeAbba(String n1,String n2) {
	
	String plus=n1+n2+n2+n1;
	return plus;
}
}
