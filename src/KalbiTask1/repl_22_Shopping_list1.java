package KalbiTask1;

import java.util.Scanner;

public class repl_22_Shopping_list1 {
	/*
	  In this assignment you will write a program to create a shopping list and prices.
	 You will use Scanner object and ask user to enter 3 items followed by its
	 price and you will calculate total price and show as a report.
	 Declare 4 String variables item1, item2, item3, report.
	 Declare double variables price1, price2, price3, totalPrice
	 Create a Scanner object named scan
	 */

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item1 and its price:");
		String item1=sc.nextLine();
		double  price1=sc.nextDouble();
		sc.nextLine();
	
		System.out.println("Enter Item2 and its price:");
		String item2=sc.nextLine();
		double price2=sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Enter Item3 and its price:");

		String item3=sc.nextLine();
		double price3=sc.nextDouble();
	
		String report="Item1:"+item1+" Price:"+price1+" , "+"Item2:"+item2+" Price: "+price2+" , "+"Item3:"+item3+" Price: "+price3;
		System.out.println(report);

		
		double totalPrice=price1+price2+price3;
		System.out.println("Total price is:"+totalPrice);
	
		
		
	
		
		
		
	}

}
