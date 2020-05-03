package Repl_Assignment_part_5;

import java.util.Scanner;

public class repl_148_Methods10_printnext3numbers {
	/*
	 * Create a method called next3 . 
	 * This method gets an int argument and prints the next 3 numbers after that number. 
	 * Call the method from main method and pass num to it.
	 */

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	     next3(num);
	     
	}

	
	public static void next3(int num) {
		for(int i=num+1;i<=num+3;i++) {
			System.out.println(" "+i);
			
		}
	}
}
