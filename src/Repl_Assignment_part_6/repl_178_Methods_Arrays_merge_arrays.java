package Repl_Assignment_part_6;

import java.util.Arrays;

public class repl_178_Methods_Arrays_merge_arrays {

	public static void main(String[] args) {
		int[]c= {1,2,3};
		int[]d= {4,5,6};
		System.out.println(Arrays.toString(mergR(c,d)));
		
	               
		

	}
	  public static int[] mergR(int[] a,int[] b) {
		    
		  int length = a.length + b.length; //add the length of firstArray into secondArray 
		  int[] mergedArray = new int[length];    //resultant array  
		  int pos = 0; 
		  for (int element : a) //copying elements of a array  using for-each loop  
		  {  
		  mergedArray[pos] = element;  
		  pos++;              //increases position by 1  
		  }  
		  for (int element : b) //copying elements of b array using for-each loop  
		  {  
		  mergedArray[pos] = element;  
		  pos++;  
		  }  
		  
		  
		return mergedArray;  //prints the resultant array  
		  

		    
	  }//end mergR
	
	  
	  
}
