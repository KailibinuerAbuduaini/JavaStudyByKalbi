package Day023_StringManipulation;

public class Question_16 {

	public static void main(String[] args) {
		
		System.out.println(atFirst("hw"));

	}
	
	

	
public static String atFirst(String s) {
	

	if(s.length()>=2) {
		String a=s.substring(0, 2);
		
		return a;
	
	}else if(s.length()<2) {
		
		String b=s.substring(0,1).concat("@");
		return b;

}
	return s;}
}
