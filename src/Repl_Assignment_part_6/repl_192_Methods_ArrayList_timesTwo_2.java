package Repl_Assignment_part_6;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_192_Methods_ArrayList_timesTwo_2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
		
        timesTwo(arr);
	}

	public static void timesTwo( ArrayList <Integer> nums) {
		
		for(int i=0;i<nums.size();i++) {
		nums.set(i, nums.get(i)*2);//set() method is used to set an element in an ArrayList object at the specified index.
		
		
		}
		System.out.println(nums.toString());
		
	}
}
