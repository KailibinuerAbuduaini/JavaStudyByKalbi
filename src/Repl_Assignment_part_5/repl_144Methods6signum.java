package Repl_Assignment_part_5;

import java.util.Scanner;

public class repl_144Methods6signum {
	public static void sign(int n)
	  {
		
		if(n>=1) {
			System.out.println("positive");
		}else if(n<=-1) {
			System.out.println("negative");
		}else if(n==0) {
			System.out.println("zero");
		}
	    //your code here
	  }//end sign

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);

	}

}
