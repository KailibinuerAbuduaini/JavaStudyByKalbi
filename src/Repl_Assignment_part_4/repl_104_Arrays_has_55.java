package Repl_Assignment_part_4;

import java.util.Scanner;

public class repl_104_Arrays_has_55 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	     boolean flag=false;
	    for(int i=0;i<nums.length-1;i++) {
	    	
	    
	    	if(nums[i]==5&&nums[i+1]==5) {
	    		flag=true;
	    	
	    	}
	    }
   System.out.println(flag);
	}

}
