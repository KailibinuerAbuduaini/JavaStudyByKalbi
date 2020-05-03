package Day022_String_manipulation;

public class Lab_question_3 {

	public static void main(String[] args) {
		/*
		 * Create a method return a new string made of 3 copies of the last 2
         chars of the original string. The string length will be at least 2
		 */
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("i am kelly"));
		System.out.println(extraEnd("a"));
	}
     public static String extraEnd(String n1) {
	 
	if(n1.length()<2){
		return "invalid";
	}
     
	String last=n1.substring(n1.length()-2);
      
	return last+last+last;
	}
}

