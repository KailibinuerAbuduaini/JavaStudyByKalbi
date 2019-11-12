package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_60_Verify_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    String word = scan.nextLine();
		    String sentence = scan.nextLine();
		    if(sentence.contains(word)) {
		    	System.out.println(true);
		    }else {
		    	System.out.println(false);
		    }
	}

}
