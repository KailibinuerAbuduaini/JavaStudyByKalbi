package KalbiTask1;

import java.util.Scanner;

public class repl_38_Positive_Negative_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		    System.out.println("Enter a number:");
		    int number = input.nextInt();
		   
		    if(number>0) {
		    	System.out.println(number+" is positive");
		    }else if(number<0) {
		    	System.out.println(number+" is negative");
		    }else if(number==0) {
		    	System.out.println(" it is zero");
		    }
	}

}
