package Day019_String_manipulation;

public class Task_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String word = "CybertekSchool";
		//Output: e,e,o,o
		
		
		for (int i=0; i<word.length(); i++) {
			char letter=word.charAt(i);
			if(letter== 'a' || letter == 'e' || letter=='o' ||letter == 'i' || letter=='u') {
			System.out.print(letter);
			if(i !=word.length()-2) {
				System.out.print(",");
			}
		}
		}	
	}

}
