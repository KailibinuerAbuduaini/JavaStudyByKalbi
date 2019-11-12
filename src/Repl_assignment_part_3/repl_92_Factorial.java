package Repl_assignment_part_3;

import java.util.Scanner;

public class repl_92_Factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
		Long result=1L;
	   
		for(int i=n;i>=1;i--) {
			result=result*i;
		}
	    	System.out.println(result);
	    }
	    
	
}
