package Day018_reading_Input;

import java.util.Scanner;

public class Task_72 {
	
	//Write a program that ask user to enter 3 numbers and shows the total of numbers.

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter first number:");
    int num1=sc.nextInt();
    
    System.out.println("enter second number:");
    int num2=sc.nextInt();
    
    System.out.println("enter third number:");
    int num3=sc.nextInt();
   int sum=num1+num2+num3;
    System.out.println("total:" +sum);
	}

}
