package KalbiTask1;

import java.util.Scanner;

public class repl_50_Switch_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner scan = new Scanner(System.in);
		    System.out.println("Enter command:");
		    char response = scan.next().charAt(0);
		    
		    
		    switch(response) {
		    case 'y':
		    System.out.println("Your request is being processed");
		    break;
		    case 'n':
		    System.out.println("Thank you anyway for your consideration");
		    break;
		    case'h':
		    	System.out.println("Sorry, no help is currently available");
		    	break;
		    default:
		    	System.out.println("Invalid entry, please try again!");
		    	
		    }
	}

}