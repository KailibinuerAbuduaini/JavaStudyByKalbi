package KalbiTask1;

import java.util.Scanner;

public class bag_of_cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("number of cookies:");
		int cookies=sc.nextInt();
		
		
		double total_calories=cookies*(300/(40/10));
		 System.out.println(" number of total calories:"+total_calories);
	}
	
}
