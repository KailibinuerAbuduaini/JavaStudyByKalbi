package self_exercise;

import java.util.Scanner;

public class stringLength {

	public static void main(String[] args) {
		/*Write a program that ask user to enter his/her firstname and lastname. Display in the
          console total number of characters.
		 * 
		 */

		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter your first name: ");
		String firstname=sc.next();
		System.out.println("enter your last name: ");
		String lastname=sc.next();
		int total=firstname.length()+lastname.length();
		
		System.out.println("total number of characters:"+total);
	}

}
