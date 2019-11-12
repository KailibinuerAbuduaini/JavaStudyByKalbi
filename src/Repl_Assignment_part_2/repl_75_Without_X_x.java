package Repl_Assignment_part_2;

import java.util.Scanner;

/*
 * Given a string word, if the first or last chars are 'x' or 'X',
 *  print the string without those 'x' or 'X' chars,  
 * otherwise print the string unchanged. 
 */
public class repl_75_Without_X_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		    String first=word.substring(0,1);
		    String last=word.substring(word.length()-1);
		 if(first.equalsIgnoreCase("x")&&last.equalsIgnoreCase("X")) {
			 System.out.println(word.substring(1,word.length()-1));
		 }else if(first.equalsIgnoreCase("x")) {
			 System.out.println(word.substring(1,word.length()));
		 }else if(last.equalsIgnoreCase("X")){
			 System.out.println(word.substring(0,word.length()-1));
		 }else {
			 System.out.println(word);
		 }
		 
		 
		    	
		    
	}

}
