package Day019_String_manipulation;

import java.util.Scanner;

public class Task_75 {

	public static void main(String[] args) {
		/*
		 * Write a program that ask user to enter his/her firstname and lastname. Display in the
          console total number of characters.
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		
		String first_name=sc.next();
		String last_name=sc.next();
		 String str1=new String( first_name+last_name);
         System.out.println(str1.length());
		
	
		
		
	}

}
