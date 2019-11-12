package KalbiTask1;

import java.util.Scanner;

public class repl_40_quiz_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    String a = s.nextLine();
	    
	    switch(a) {
	    case "a":
	    System.out.println(a+" is wrong");
	    break;
	    
	    case "b":
	    	System.out.println(a+" is correct");
	    	 
	    break;
	    
	    case "c":
	    System.out.println(a+" is wrong");
	    break;
	    default:
	 System.out.println(a+" is not a valid answer");
	
	

	}
	    
	}

}
