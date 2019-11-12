package Repl_Assignment_part_2;

/*
 * Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books
 *  and offers 2 free books with every purchase of 8 or more books.
 *  It offers regular customers 1 free book with every purchase of 7 or more books, 
 * and offers 2 free books with every purchase of 12 or more books. 
    
  Write a program that assigns freeBooks the appropriate value based on the
   values of the boolean variable isPremiumCustomer and the int variable 
   nbooksPurchased. Print amount of freeBooks into the console. 

 */

import java.util.Scanner;

public class repl_80_Online_Book_Merchants {

	public static void main(String[] args) {
		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("are you a PremiumCustomer ?");
		boolean isPremiumCustomer = scan.nextBoolean();
		
		System.out.println("how many book you purchased?");
		int nbooksPurchased = scan.nextInt();

		if (isPremiumCustomer == true) {
			if (nbooksPurchased >= 5 && nbooksPurchased < 8) {
				freeBooks = 1;
			} else if (nbooksPurchased >= 8) {
				freeBooks = 2;
			}
		}

		else if (isPremiumCustomer == false) {
			
			 if (nbooksPurchased >= 7 && nbooksPurchased < 12) {
				freeBooks = 1;
			} else if (nbooksPurchased >= 12) {
				freeBooks = 2;
			}
		}

		System.out.println("you got " + freeBooks + " freeBooks");
	}

}
