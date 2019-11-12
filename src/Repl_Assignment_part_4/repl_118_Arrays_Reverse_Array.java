package Repl_Assignment_part_4;

import java.util.Arrays;
import java.util.Scanner;

public class repl_118_Arrays_Reverse_Array {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	   //TODO: write your code below
	
	  int i=0;
	    while(i<nums.length/2)	 {
	    	int change=nums[0];
			nums[0]=nums[nums.length-1];//7
			
			nums[nums.length-1]=change;
			
			
			int change2=nums[nums.length-(i+2)];
			nums[nums.length-(i+2)]=nums[i+1];
			nums[i+1]=change2;
			
			i++;
		}
	    

	    
	    //Do not change below statement:
	 

	
	   System.out.println(Arrays.toString(nums));
	}
}
