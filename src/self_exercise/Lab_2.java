package self_exercise;

public class Lab_2 {

	public static void main(String[] args) {
		make("hi","bye");
		System.out.println(make("hi","bye"));

	}
public static String make(String a,String b) {
	 String c=a+b+b+a;
	 return c;
}
}
