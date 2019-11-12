package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_66_Merge_them {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    
		    if(word1.length()==3&&word2.length()==3) {
		System.out.println(word1.substring(0,1)+word2.substring(0,1)+word1.substring(1,2)
		+word2.substring(1,2)+word1.substring(2)+word2.substring(2)); 
		
		    }else if(word1.length()!=3||word2.length()!=3) {
		    	System.out.println("cannot merge");
		    }
		    
	}

}
