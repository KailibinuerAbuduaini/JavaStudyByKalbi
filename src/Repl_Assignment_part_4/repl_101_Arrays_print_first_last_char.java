package Repl_Assignment_part_4;

import java.util.Arrays;
import java.util.Scanner;

public class repl_101_Arrays_print_first_last_char {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
	  
	    
	    for(int i=0;i<words.length;i++) {
	    	String first=words[i].substring(0,1)+words[i].substring(words[i].length()-1);
	    	System.out.println(first);
	    }

	}

}
