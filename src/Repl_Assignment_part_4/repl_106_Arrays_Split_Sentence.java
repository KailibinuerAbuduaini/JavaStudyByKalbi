package Repl_Assignment_part_4;

import java.util.Arrays;
import java.util.Scanner;

public class repl_106_Arrays_Split_Sentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		// type your code below

		String[] quote = sentence.split(" ");
		for (String a : quote) {

			System.out.println(a);

		}

	}

}
