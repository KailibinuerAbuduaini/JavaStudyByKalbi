package Day023_StringManipulation;

public class lab_question_13 {

	public static void main(String[] args) {
		
		String str = "Hi-there";  //TThhee   substring(0,1) substring(1,2)   substring(2,3)
		
		
		
		
		String newString="";   //TThhee
		
		

		for(int i=0;i<str.length();i++) {
			String oldstr=str.substring(i, i+1);
			
			newString = newString + oldstr.concat(oldstr); 
			                                                       
		}
		
		System.out.println(newString);
	}

}
