package Repl_Assignment_part_6;

public class repl_166_Methods_String_merge {

	public static void main(String[] args) {
		System.out.println(mergeStrings("java", "selenium"));

	}
	public static String mergeStrings(String one, String two) {
		 // To store the final string 
        StringBuilder result = new StringBuilder(); 
  
        // For every index in the strings 
        for (int i = 0; i < one.length() || i < two.length(); i++) { 
  
            // First choose the ith character of the 
            // first string if it exists 
            if (i < one.length()) 
                result.append(one.charAt(i)); 
  
            // Then choose the ith character of the 
            // second string if it exists 
            if (i < two.length()) 
                result.append(two.charAt(i)); 
        } 
  
        return result.toString();
	    
	    
	  }
}
