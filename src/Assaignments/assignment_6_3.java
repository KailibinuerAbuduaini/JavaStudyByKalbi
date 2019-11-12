package Assaignments;

import java.util.Scanner;

/*
 * Below is One-dimensional array code:
char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};

Write the code to search for particular character in above array.
If I search for 'B', then output should be: "B found!"
If I search for 'E', then output should be: "E Not found!"
 */

public class assignment_6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char word = 'B';
		boolean flag = false;
		char array[] = new char[] { 'A', 'Z','B', 'N', 'P', 'T', 'X', 'C' };
	
	

		for (int i = 0; i < array.length; i++) {
			if (array[i] == word) {
				flag = true;
				break;

			}
		}
		if (flag) {
			System.out.println("FOUND IT");
		} else {
			System.out.println("NOT FOUND IT");
		}
	}
}
