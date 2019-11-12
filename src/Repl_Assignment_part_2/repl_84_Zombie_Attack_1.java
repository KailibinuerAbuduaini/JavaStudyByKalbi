package Repl_Assignment_part_2;

import java.util.Scanner;

/*
 * A variable inhabitants represents a city and its respective populations. 
 * City might have a population of 0 due to a pandemic zombie disease that is
 *  wiping away the human lives. After each day, a city will lose half of its 
 *  population.write a program to loop the city population and make it lose half of
 * its population until no humans left. Print the each day like below for each day:

 */

public class repl_84_Zombie_Attack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		   
	    int inhabitants = scan.nextInt();
	    int Day=0; String report;
	    
	    
	    
		while(inhabitants!=0) {
			
			report="Day "+Day+" ["+inhabitants+"]";
			System.out.println(report);
			inhabitants=inhabitants/2;
			Day++;
		}
		System.out.println("---- EXTINCT ----");
	}
	
}
