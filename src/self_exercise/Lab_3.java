package self_exercise;

public class Lab_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 extra("hello");
		 System.out.println(extra("hello"));
	}
public static String extra(String a) {
	if(a.length()<2) {
	
		return "invalid";
	} 
	
        String last=a.substring(a.length()-2);
         return last+last+last;
}
}
