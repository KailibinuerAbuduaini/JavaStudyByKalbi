package KalbiTask1;

import java.util.Scanner;

public class repl_39_Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		    System.out.println("Enter a number:");
		    int number = input.nextInt();
		    if(number%2==0) {
		    	System.out.println(number+" is even");
		    }else if(number%2!=0) {
		    	System.out.println(number+" is odd");
		    }
	else if(number==0) {
		System.out.println(number+" is even");
	}
	}
}

