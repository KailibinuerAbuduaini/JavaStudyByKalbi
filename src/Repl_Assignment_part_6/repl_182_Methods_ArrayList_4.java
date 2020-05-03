package Repl_Assignment_part_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class repl_182_Methods_ArrayList_4 {

	public static void main(String[] args) {
		
		ArrayList<String> nums = new ArrayList<>();
		nums.add("4");
		nums.add("2");
		nums.add("8");
		
            test(nums);
 
           
	}
	public static void test(ArrayList<String> words)
	{
		//write code here
		//The ArrayList.set() method is used to set an element in an ArrayList object at the specified index.
		words.set(0, "git");
		
		words.set(2, "gud");
		
		
		System.out.println(words.toString());
		
	}
}
