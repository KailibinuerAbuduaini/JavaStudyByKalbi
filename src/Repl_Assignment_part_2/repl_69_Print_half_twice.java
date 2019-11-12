package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_69_Print_half_twice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		    System.out.println(word.substring(0,word.length()/2)+word.substring(0,word.length()/2));
	}

}
