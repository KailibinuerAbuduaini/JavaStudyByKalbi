package Repl_Assignment_part_6;

import java.util.ArrayList;

public class repl_187_Method_ArrayList_CombineAll {

	public static void main(String[] args) {
		

	}

	public static  ArrayList<String> combineAL(ArrayList wordList1 , ArrayList wordList2) {
		ArrayList<String> wordList3=new ArrayList<String>();
		wordList3.addAll(wordList1);
		wordList3.addAll(wordList2);
		return wordList3;
		
	}
}
