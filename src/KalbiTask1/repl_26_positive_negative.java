package KalbiTask1;

import java.util.Scanner;

public class repl_26_positive_negative {
	/*
	  in this assignment you are given an int num.
      you need to check if num is positive negative or equals to zero.
      use 3 if statements to do this .
      output if num is positive negative or zero

	 */

	public static void main(String[] args) {
	
		  Scanner s = new Scanner(System.in);
		    int num = s.nextInt();
		    
		    if(num>0) {
		    	System.out.println("positive");
		    }else if(num<0) {
		    	System.out.println("negative");
		    }else if(num==0) {
		    	System.out.println("zero");
		    }  
	}

}
