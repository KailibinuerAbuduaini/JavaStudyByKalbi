package Repl_Assignment_part_2;

/*
 * Imagine you have a party and need to form the list of the guests. 
 * (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.
 */

import java.util.Scanner;

public class repl_83_Party {

	public static void main(String[] args) {
		 String name,answer;
		 String Geust_list="";
		
	do {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please enter guest name:");
		 name=input.nextLine();
		 Geust_list= Geust_list+name+",";
		 
		 System.out.println("Do you want to enter new guest name:");
		 answer=input.nextLine();
		 }while(answer.equalsIgnoreCase("yes"));
		 
	Geust_list=Geust_list.substring(0,Geust_list.length()-1);
		 System.out.println("Guest's list: "+Geust_list);
	}

}
