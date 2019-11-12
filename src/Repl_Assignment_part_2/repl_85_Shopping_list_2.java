package Repl_Assignment_part_2;
/*
 * Your program should ask use to enter items followed by its price.
 *  After adding item,  ask user if he wants to add one more item. 
 *  If so, repeat previous steps again. If no, print shopping list report and
 *   total price as show in examples. Your program should accept up to 10 items. 

 */

import java.util.Scanner;

public class repl_85_Shopping_list_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String countinue = "";
			double price = 0;
			int count = 1;
			double totalPrice = 0;
			
			
			do {
			System.out.println("Enter Item "+count+" and its price:");
			item=scan.next();
			price=scan.nextDouble();
			
			 totalPrice =totalPrice+price;
			 
			
			 
			 shoppingListReport =shoppingListReport + "Item"+count+": "+item+" Price: "+price;
			 
			 count++;
			System.out.println("Add one more item?");
			
			countinue=scan.next();
			}while(countinue.equalsIgnoreCase("yes"));
	shoppingListReport=shoppingListReport.substring(shoppingListReport.length()-1).replace(",", "");
			System.out.println(shoppingListReport);
			System.out.println("Total price: "+totalPrice);
			
			
			
			
			
			
			
			

		}
				
		
			
	}
