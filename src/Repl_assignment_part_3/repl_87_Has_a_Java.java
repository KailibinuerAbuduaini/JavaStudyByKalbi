package Repl_assignment_part_3;

import java.util.Scanner;

public class repl_87_Has_a_Java {

	public static void main(String[] args) {
		  boolean exists = false;
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		  if(word.length()>=4) {
		    
if((word.substring(0,4)).equals("java")||(word.substring(1,5)).equals("java")){
		    		exists=true;
		    	
		    	}else if(word.length()<4) {
		    		exists = false;
		    		
		    	}
         
		    }
		  System.out.println(exists);
	}

}
