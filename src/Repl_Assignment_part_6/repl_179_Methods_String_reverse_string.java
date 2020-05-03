package Repl_Assignment_part_6;

public class repl_179_Methods_String_reverse_string {

	public static void main(String[] args) {
		System.out.println(reverse("foo"));

	}
	public static String reverse(String input)
	{
		
		String reverse="";
		 for (int i = input.length()-1; i>=0; i--) {
	        reverse+=input.charAt(i);
		
	    } 
		 return reverse; 
	}

}