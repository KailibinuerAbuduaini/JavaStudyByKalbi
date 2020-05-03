package Repl_Assignment_part_6;

public class repl_194_Methods_String_palindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Noon"));

	}
	 public static boolean isPalindrome(String check) {
		 String str="";
		    
		for(int i=check.length()-1;i>=0;i--) {
			
			str=str+check.charAt(i);
	
		}
			if(check.replace(" ", "").equalsIgnoreCase(str.replace(" ", ""))) {
				return true;
			}else {
				
			}
			return false;
		
	  }
}
