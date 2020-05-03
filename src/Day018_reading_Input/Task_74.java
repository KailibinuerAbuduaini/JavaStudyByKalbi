package Day018_reading_Input;

import java.util.Scanner;

public class Task_74 {

	public static void main(String[] args) {
		/*
		 * Write a program that calculates the sum of numbers entered by the user until user enters
          a negative number.
		 */

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;



		
do {
	       System.out.print("Enter your number:");
	       num = sc.nextInt();
	
		
			if (num < 0) {
				break;
			}else if(num>0) {
				sum=sum+num;
			}
			
			}while(true);
		
		System.out.println("Total is:" + sum);

	}
}