package Day018_reading_Input;

import java.util.Scanner;

public class Task_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput;
		int secretNumber=8;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter secret number:");
		 
		  do {
				
		userInput = sc.nextInt();
		if(userInput==secretNumber) {System.out.println("Congrat, you got it.");
		}
		 else if(userInput<secretNumber ) {System.out.println("Enter a bigger number:");
		 }
		else if(userInput>secretNumber) {System.out.println("Enter a smaller number:");
		}			
		}while(userInput !=secretNumber);
	}
	
}

