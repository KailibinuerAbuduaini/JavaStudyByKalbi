package KalbiTask1;

import java.util.Scanner;

public class repl_Time {
	
	
//	In this assignment, you will write code to put together time of day.
//
//	Like this: 12:24:33 PM
//
//
//	1. Declare variables: hour, minute, second that can hold int values.
//	    Declare amOrPm variable that can hold a String ("AM" or "PM")
//
//	2. Instructor will set different values to your variables
//
//	3. Using the variables and concatenation, print values in the format mentioned above.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //1. WRITE YOUR CODE HERE:
	    
	    System.out.println();
	    
	    
	    //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES 
	    Scanner sc = new Scanner(System.in);
	   int hour   = sc.nextInt();
	   int minute = sc.nextInt();
	   int second = sc.nextInt();
	   String amOrPm = sc.next();
	    //#############################
	    
	     //2. WRITE YOUR CODE HERE:
  System.out.println(hour+":"+minute+":"+second+amOrPm);
	     
	}

}
