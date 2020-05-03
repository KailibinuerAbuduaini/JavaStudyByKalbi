package self_exercise;

public class Staticdemo {
	
	
	static String n1=examName("o");
	{
		n1=examName("A");
	}
	
	static{
		n1=examName("c");
	}
	
	public static void main(String[] args) {
		Staticdemo sd=new Staticdemo();

	}
	private static String examName(String s) {
		System.out.println(s);
		return s;
	}

}
