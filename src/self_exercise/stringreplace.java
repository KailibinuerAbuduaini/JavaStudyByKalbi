package self_exercise;

public class stringreplace {

	public static void main(String[] args) {
		String a="10/10/2019 14:30:20";
		
		
	     String	b=a.replace("/", "");
	
         String  c= b.replace(":", "");
		String d=c.replace(" ", "");
		System.out.println(d);
		
	}

}
