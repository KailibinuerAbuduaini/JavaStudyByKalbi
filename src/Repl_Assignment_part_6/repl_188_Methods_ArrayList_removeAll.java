package Repl_Assignment_part_6;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_188_Methods_ArrayList_removeAll {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
		removeAll(wordList,"hi");

	}
    public static void removeAll(ArrayList wordList,String targetWord) {
    	
    	
    	// in here we change String to Arraylist;
    	ArrayList<String> List = new ArrayList<String>(Arrays.asList(targetWord));
    	wordList.removeAll(List);// removeAll()this method accept only collection like Arraylist;
    	
    	System.out.println(wordList);
    	
    }
	
}
