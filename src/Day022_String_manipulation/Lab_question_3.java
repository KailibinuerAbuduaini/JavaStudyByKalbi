package Day022_String_manipulation;

public class Lab_question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("i am kelly"));
		System.out.println("a");
	}
public static String extraEnd(String n1) {
	 
	if(n1.length()<2){
		return "invalid";// miye chiqmidi
	}
     
	String last=n1.substring(n1.length()-2);
      
	return last+last+last;
	}
}

