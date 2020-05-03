package Repl_Assignment_part_6;

public class repl_189_Methods_Find_error_string {

	



	public static void main(String[] args) {
		
System.out.println(isError("error one two") );
	}

	 public static boolean isError(String line) {
		 
	 for(int i=0;i<line.length()-3;i++) {
		 
		 if(line.substring(0, i+4).equalsIgnoreCase("error")) {
			 return true;
		 }
	 }
	return false;
		
	  
	    	
	    }
	  }

