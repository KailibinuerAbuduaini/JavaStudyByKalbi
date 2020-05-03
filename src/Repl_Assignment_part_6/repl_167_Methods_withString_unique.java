package Repl_Assignment_part_6;

public class repl_167_Methods_withString_unique {

	/*
	 * uniqueChars is a method that you will code now, should be able to accept any
	 * string in the world and return unique characters from the parameter.
	 * 
	 * logic for this code is :delete already existing duplicates using an else
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		// TODO: write your below

		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (temp.indexOf(ch) == -1) {// indexOf(ch):returns the index of the first occurrence of character ch in a
											// given String.
				temp = temp + ch;
			} else {
				temp.replace(String.valueOf(ch), "");// added this to your existing code

			}
		}
		// System.out.println(temp+" ");
		return temp;
	}

	public static String uniqueChars(String str) {
		// TODO: write your below
		String nonDuplictaed = "";
		for (int i = 0; i < str.length(); i++) {
			if (!nonDuplictaed.contains("" + str.charAt(i))) {
				nonDuplictaed += "" + str.charAt(i);
			}
		}
		return nonDuplictaed;

	}

}
