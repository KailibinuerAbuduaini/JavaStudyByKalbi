package Repl_Assignment_part_4;

import java.util.Scanner;

public class repl_114_Arrays_find_non_duplicate {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
 int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	boolean unique=true;
	for(int i=0;i<nums.length;i++) {
		for(int j=0;j<nums.length;j++) {
			
		if(i!=j) {
			if(nums[i]!=nums[j]) {
				unique=true;
			}else  {
				unique=false;
				break;
			}
		
		}
		}
		if(unique) {
			System.out.println(nums[i]);
		}
	
			
		}
	
		
	}
	
}
