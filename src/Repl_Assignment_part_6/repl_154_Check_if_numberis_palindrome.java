package Repl_Assignment_part_6;

import java.util.Scanner;

public class repl_154_Check_if_numberis_palindrome {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);

	}


	public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
		 int palindrome = num; // copied number into variable
	        int reverse = 0;

	        while (palindrome != 0) {
	            int remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome = palindrome / 10;
	        }

	        // if original and reverse of number is equal means
	        // number is palindrome in Java
	        if (num == reverse) {
	            System.out.println(true);
	        }else {
	        	System.out.println(false);
	        }
	        
	    }
	}
