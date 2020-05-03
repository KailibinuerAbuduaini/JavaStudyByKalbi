package self_exercise;

public class stringtVowel {

	public static void main(String[] args) {
		/*
		 * Write a program to print only vowel (a,e,o,i,u) in given string
          String word = "CybertekSchool";
          Output: e,e,o,o
		 */
		
		String word = "CybertekSchool";
		for(int i=0;i<word.length();i++) {
			char letter=word.charAt(i);
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='o'
					||word.charAt(i)=='e'||word.charAt(i)=='i'||
					word.charAt(i)=='u') {
				System.out.print(letter);
				
				
				
				if(i !=word.length()-2) {
					System.out.print(",");
				}
			}
			
		}

	}

}
