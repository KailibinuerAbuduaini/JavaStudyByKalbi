package Repl_Assignment_part_6;

import java.util.Arrays;

public class repl_198_Methods_2_Arrays_add_Elements {

	public static void main(String[] args) {
		int[]arr1= new int[]{10, 40, 50, 3, 1};
		 int[]arr2= new int[]{11, 0, 500, 44, 1101};
		 
		
		 
		 System.out.println(Arrays.toString(addElements(arr1,arr2)));
		

	}
	  public static int[] addElements(int[] ints1, int[] ints2) {
		    
		
		    int[] newArr=new int[ints1.length];
		    
		    
		    for(int i=0;i<ints1.length;i++) {
		
		    		newArr[i]=ints1[i]+ints2[i];
		    	}
		    
			return newArr;
		    
		    
		    
		    
		    
	  }
}
