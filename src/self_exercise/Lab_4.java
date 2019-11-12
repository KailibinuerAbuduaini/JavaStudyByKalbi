package self_exercise;

public class Lab_4 {

	public static void main(String[] args) {
	first("sdcdg");
	first("a");
	System.out.println(first("sdcdg"));
	System.out.println(first("a"));
	System.out.println(first(""));

	}
public static String first(String n1) {
	if(n1.length()<2) {
		return n1;
	}else if(n1.isEmpty()) {
		return "";
	}else {
	String b=n1.substring(0,2);
	return b;
}
}
}