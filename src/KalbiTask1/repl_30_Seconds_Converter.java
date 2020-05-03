package KalbiTask1;

import java.util.Scanner;

public class repl_30_Seconds_Converter {

	public static void main(String[] args) {
		
//		Write a program that outputs the number of hours, minutes, and seconds that
//		corresponds to input total seconds. 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter seconds:");
		int second=scan.nextInt();
		
		int hour=second/3600;
		second=second%3600;
		int minute=second/60;
		 second=second%60;
		 
	 System.out.println(hour+" hours, "+minute+" minutes, " + " and "+second+" seconds");
		
	 
		
	}

}
