package KalbiTask1;

import java.util.Scanner;

public class repl_25_greater_number {
	/*
	 * using an if statement check which int is larger a or b, and then output:
       "number is greater".
	 */

	public static void main(String[] args) {
		
	    Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	    int b = s.nextInt();
	    if(a>b) {
	    	System.out.println(a+" is greater");
	    }else if(b>a) {
	    	System.out.println(b+" is greater");
	    }
	}

}
