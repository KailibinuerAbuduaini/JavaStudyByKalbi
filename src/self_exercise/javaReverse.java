package self_exercise;

public class javaReverse {

	public static void main(String[] args) {
		
		String a="guzal";
		
		System.out.println(a.toCharArray());
		
		System.out.println(StrReverse2("hello"));
	}
	static String StrReverse2(String str) { // purpose of use static in here is we can call this method in main method without creat object

		String reverse="";

		for(int i=str.length()-1; i >= 0; i--) {

		reverse += str.toCharArray()[i];

		}

		return  reverse;

		}
}
