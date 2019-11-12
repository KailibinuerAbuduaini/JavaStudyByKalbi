package Day022_String_manipulation;

public class Lab_question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helloName("kelly");
		System.out.println(helloName("kelly"));
	}
public static String helloName(String name){
	String greeting="hello"+" "+name;
	
	return greeting;
}
}
