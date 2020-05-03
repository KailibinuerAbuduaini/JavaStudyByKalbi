package self_exercise;

public class stringOccurrences {

	public static void main(String[] args) {
		
		String word = "abcabqcabc";
		
		int count=0;
		char myChar='q';
		
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==myChar) {
				count++;
			}
			
		}
System.out.println("number of occurence "+count);
	}

}
