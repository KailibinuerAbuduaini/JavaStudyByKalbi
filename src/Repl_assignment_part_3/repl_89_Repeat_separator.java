package Repl_assignment_part_3;

import java.util.Scanner;

public class repl_89_Repeat_separator {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    String separator = scan.next();
		    int count = scan.nextInt();
		    String   result="";
	     
	     for(int i=1;i<=count;i++) {
	    	 result=result+word+separator;
	     }
	    	 System.out.print(result.substring(0,(result.length()-separator.length())));

	

	     
	}
}
