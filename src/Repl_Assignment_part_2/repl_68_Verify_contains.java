package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_68_Verify_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           boolean flag=false;
		 Scanner scan = new Scanner(System.in);
		    String word = scan.nextLine();
		    String sentence = scan.nextLine();
		   if(sentence.contains(word)) {
			   flag=true;
			   System.out.println(flag);
			   
		   }else {
			   System.out.println(flag);
			   }
		   
		    
	}

}
