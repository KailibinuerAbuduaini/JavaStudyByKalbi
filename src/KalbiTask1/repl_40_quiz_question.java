package KalbiTask1;

import java.util.Scanner;

public class repl_40_quiz_question {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    String select = s.nextLine();
	    
	    switch(select) {
	    case "a":
	    System.out.println(select+" is wrong");
	    break;
	    
	    case "b":
	    	System.out.println(select+" is correct");
	    	 
	    break;
	    
	    case "c":
	    System.out.println(select+" is wrong");
	    break;
	    default:
	 System.out.println(select+" is not a valid answer");
	
	

	}
	    
	}

}
