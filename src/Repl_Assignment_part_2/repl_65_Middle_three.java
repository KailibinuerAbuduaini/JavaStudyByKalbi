package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_65_Middle_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		    int mid=word.length()/2;
		    if(word.length()>=5&&word.length()%2==1) {
		    	 
		    		System.out.println(word.substring(mid-1, mid+2));
		    	}else if(word.length()<5&&word.length()%2==0||word.length()%2==1)
		    		{System.out.println("invalid");}
		    	else if( word.length()>5&&word.length()%2==0){
		    	  System.out.println("invalid");
		    	  
		    	}
		    }
	}


