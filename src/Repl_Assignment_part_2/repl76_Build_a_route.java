package Repl_Assignment_part_2;

import java.util.Scanner;

/*
 * Write a program that will print out route instructions. 
 * Your program should take 2 parameters: start point and end point. 
 * Use left, right, up and down for navigation. Insert ">" between commands.
 *  If start point equals to end point - display: "start/end(start or end variable!) found".
Note: you may move only clock wise.
 */

public class repl76_Build_a_route {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		   String start = scan.next();
		    String end = scan.next();
		    
		if(start.equalsIgnoreCase("A")&&end.equalsIgnoreCase("A")) {
			System.out.println(start+"found");
		}else if(start.equalsIgnoreCase("A")&&end.equalsIgnoreCase("B")){
			System.out.println("right: "+end+"found");
		}else if(start.equalsIgnoreCase("A")&&end.equalsIgnoreCase("c")) {
			System.out.println("right>");
		   }
			   
	}

}
