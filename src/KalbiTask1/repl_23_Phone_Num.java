package KalbiTask1;

import java.util.Scanner;

public class repl_23_Phone_Num {

	public static void main(String[] args) {
		

//		Write a program that asks user to input int values: areaCode and localNumber.
//
//		-Using concatenation put together in this format and assign to String phoneNumber  variable:
//
//		-(222)-3334444
//
//		-Write a print statement that displays (use phoneNumber variable ): 
//		Calling number (222)-3334444
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter areaCode ande localNumber:");
		int areaCode=sc.nextInt();
		
		int localNumber=sc.nextInt();
	   String phoneNumber="("+areaCode+")"+"-"+localNumber;
	      System.out.println("Calling number"+phoneNumber);
	
		
         
		
	}

}
