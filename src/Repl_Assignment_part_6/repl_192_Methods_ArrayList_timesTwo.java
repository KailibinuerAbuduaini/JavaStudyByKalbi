package Repl_Assignment_part_6;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_192_Methods_ArrayList_timesTwo {

	public static void main(String[] args) {
		/*
		 * Create a method that:
          is called timesTwo
          returns nothing
         takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.
		 */
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
		
           timesTwo(arr);
	}

	public static void timesTwo( ArrayList <Integer> nums) {
		ArrayList <Integer> newArr=new ArrayList <Integer>();
		for(int i=0;i<nums.size();i++) {
		newArr.add(nums.get(i)*2);
		}
		System.out.println(newArr.toString());
		
	}
	

	
	
}
