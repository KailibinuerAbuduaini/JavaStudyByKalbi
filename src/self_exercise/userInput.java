package self_exercise;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to guess a secret number
          between 1-20. After every guess, the program tells the user whether
          their number was too large or too small. The program will keep asking
          the user to enter the number until he finds the correct number.
          When the correct answer is found, the program will display "Congrat,you got it"
		 */

		
		int userinput;
		int secretNumber=8;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		do {
			userinput=sc.nextInt();
			if(userinput==secretNumber){
				
				System.out.println("Congrat,you got it");
			}else if(userinput<secretNumber) {
				
			System.out.println("your number is  too small");
		}else if(userinput>secretNumber) {
			System.out.println("your number is  too large");
	}
		}while(userinput!=secretNumber) ;
		
	}
}


