package Repl_Assignment_part_4;

import java.util.Arrays;
import java.util.Scanner;

public class repl_125_Arrays_Make_Last {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
	    int[] nums = new int[size];
			for(int i =0; i < size; i++) {
				nums[i] = scan.nextInt();
			}
       int[] newArr=new int[2*nums.length];
       newArr[newArr.length-1]=nums[nums.length-1];
       
       System.out.println(Arrays.toString(newArr));
	}
 
}
