package KalbiTask1;

import java.util.Scanner;

public class repl_32_VendingMachine {

	public static void main(String[] args) {
		/*
		 * Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

- int variable itemPrice
- int variables quarters, dimes, nickels
- Scanner object


Program accepts itemPrice, which is a price for the item you would like to purchase.

Positive behaviour:

Please follow the example in the image. dots mean empty space.
-Since the item price was entered 95, change is 1 nickels

Negative behaviour:

If itemPrice is less than 25 or more than 100 cents, then display error message:
Invalid price!

If itemPrice is not divisible by 5, then also display error message:
Invalid price!

use (itemPrice % 5 == 0) expression to find it is divisible by 5.

Do not display anything else.
iu
		 */
		
           Scanner scan=new Scanner(System.in);
           System.out.println("Enter Price in cents:");
           int itemPrice=scan.nextInt();
           
   		if(itemPrice<25&&itemPrice>100) {
   			System.out.println("Invalid price!");
   		}else if(itemPrice%5!=0) {
   			System.out.println("Invalid price!");
   		}else if(itemPrice%5==0){
   			 itemPrice=100-itemPrice;
   			int quarters=itemPrice/25; 
   	   		itemPrice=itemPrice%25; 
   	   		int dimes=itemPrice/10;  
   	   		itemPrice=itemPrice%10;     
   	   		int nickles=itemPrice/5;  
   	   		
   	   		
   	  String result=quarters+" quarters, "+ dimes +" dimes, "+ nickles+ " nickles, " ;
   			System.out.println("Your change is "+result);
   		}

	}

}
