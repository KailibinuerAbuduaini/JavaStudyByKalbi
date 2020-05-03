package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_65_Middle_three {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		    int mid=word.length()/2;
		    if(word.length()>=5&&word.length()%2==1) {
		    	 
		    		System.out.println(word.substring(mid-1, mid+2));
		    	}else {
		    	  System.out.println("invalid");
		    	  
		    	}
		    }
	}


