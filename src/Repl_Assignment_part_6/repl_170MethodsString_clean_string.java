package Repl_Assignment_part_6;

public class repl_170MethodsString_clean_string {

	public static void main(String[] args) {
		System.out.println(clean ("one two three","two"));

		
	}
	
	//charAt:returns the character at the specified index in a string. 
	//indexOf:returns the position of the first occurrence of specified character(s) in a string.
	 public static String clean (String text ,String badWord) {

String result="";
result=text.replaceAll(badWord, "");
return result;
	      
	 }
}

