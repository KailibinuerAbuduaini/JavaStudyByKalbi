upackage KalbiTask1;

import java.util.Scanner;

public class repl_28_Shopping_list2 {
	/*
 In this assignment you will write a program to create a shopping list, count and prices.
Please read carefully! If you do not fully understand the requirement ask your classmates 
in Slack or ask your instructor!
You will use Scanner object and ask user to enter 3 items followed by its count,
price and you will calculate total price and show as a report.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item1,count and its price:");
		String item1 = sc.nextLine();
		int count1 = sc.nextInt();
		double price1 = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter Item2,count and its price:");
		String item2 = sc.nextLine();
		int count2 = sc.nextInt();
		double price2 = sc.nextDouble();

		sc.nextLine();
		System.out.println("Enter Item3,count and its price:");

		String item3 = sc.nextLine();
		int count3 = sc.nextInt();
		double price3 = sc.nextDouble();

		String report = "Item1:" + item1 + "Price:" + price1 + " , " + "Item2:" + item2 + " Price: " + price2 + " , "
				+ "Item3:" + item3 + " Price: " + price3;
		
		double totalPrice = (price1 * count1 +price2 * count2+ price3 * count3);

		if (count1 <= 0) {
			report = "Item2:" + item2 + " Price: " + price2 + ", " + "Item3:" + item3 + " Price: " + price3;
			System.out.println(report);
			totalPrice = (price2 * count2 + price3 * count3);
			System.out.println("Total price is:" + totalPrice);
		} else if (count2 <= 0) {
			report = "Item1:" + item1 + " Price: " + price1 + ", " + "Item3:" + item3 + " Price: " + price3;
			System.out.println(report);
			 totalPrice = (price1 * count1 + price3 * count3);
			System.out.println("Total price is:" + totalPrice);
		} else if (count3 <= 0) {
			report = "Item1:" + item1 + " Price: " + price1 + ", " + "Item2:" + item2 + " Price: " + price2;
			System.out.println(report);
			 totalPrice = (price1 * count1 + price2 * count2);
			System.out.println("Total price is:" + totalPrice);
		}else {
			report = "Item1:" + item1 + " Price:" + price1 + " , " + "Item2:" + item2 + " Price: " + price2 + " , "
					+ "Item3:" + item3 + " Price: " + price3;
			
			System.out.println(report);
			totalPrice = (price1 * count1 +price2 * count2+ price3 * count3);
			System.out.println("Total price is:" + totalPrice);
			
		}
	}

}
