package Repl_Assignment_part_6;

import java.util.ArrayList;

public class repl_183_Methods_ArrayList_size_get {

	public static void main(String[] args) {
		/*
		 * On the left, given an ArrayList of Integers called ints,
		 *  find and return the sum of all the Integers in ints.
		 */

	}
	public static int sum(ArrayList<Integer> ints)
	{
		//write code here
		ints.add(2);
		ints.add(312);
		ints.add(4);
		ints.add(2453);
		ints.add(668759);
		
		int sum=0;
	//size() method of java.util.ArrayList class is used to get the number of elements in this list.
	for(int i=0;i<ints.size();i++) { 
		sum=sum+ints.get(i);
		
	}
		return sum;
	}
}
