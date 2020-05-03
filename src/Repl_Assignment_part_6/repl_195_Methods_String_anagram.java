package Repl_Assignment_part_6;

public class repl_195_Methods_String_anagram {

	public static void main(String[] args) {
		
		
		System.out.println(isAnagram("listen", "Silent"));
		
       System.out.println(isAnagram("java", "cava"));
	}
	 public static boolean isAnagram(String word1, String word2) {
		    
		 
				 
				 if(word1.length()!=word2.length()) {
					return false;
					 
				 }else if(word1.length()==word2.length()){
					 
					 for(int i=0;i<word1.length();i++) {
						 for(int j=0;j<word2.length();j++) {
							 
						
					if( word1.compareTo(word2) ==0) {
						return true;
					}
					
						
					 }
						 
						 
						 
				 }
				 
				 
			 }
				return false;
				
		 }
				
	  }

