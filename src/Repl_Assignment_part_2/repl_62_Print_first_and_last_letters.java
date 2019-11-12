package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_62_Print_first_and_last_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner scan = new Scanner(System.in);
		    String word = scan.next();
	   char first= word.charAt(0);
	    char last=word.charAt(word.length()-1);
		    System.out.println(""+first+last);
	}

}
