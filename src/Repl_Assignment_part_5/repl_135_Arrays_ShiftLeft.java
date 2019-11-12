package Repl_Assignment_part_5;

import java.util.Arrays;
import java.util.Scanner;

public class repl_135_Arrays_ShiftLeft {
/*
 * Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} 
 * becomes {2, 5, 3, 6}. You may modify and print the given array,
 *  or print a new array.	
 */

	public static void main(String[] args) {
		
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i = 0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    
		    int left=nums[0];
		    for(int i=1;i<size;i++) {
		    	nums[i-1]=nums[i];// this part is important
		    	
		    }

		    nums[size-1]=left;
		   System.out.println(Arrays.toString(nums)); 
	}

}
//int temp = arr[1];
//arr[1] = arr[2];
//arr[2] = temp;

