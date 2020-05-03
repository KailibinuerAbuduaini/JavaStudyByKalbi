package self_exercise;

import java.util.Arrays;
import java.util.Collections;

public class Array_SortDescending_By_me {

	public static void main(String[] args) {
		
		
		// Write a return method that can sort an int array in 
		// descending order without using the sort method of the Arrays class
		// why we can not use sort method?
		// becuase "The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Comparator<Object>)"
		//because there is no such method in the java.util.Arrays class.
		
		
		  // unsorted array
		int[] arr = {10,20,7, 8, 90};
		
		// Getting the natural (ascending) order of the array
		  Arrays.sort(arr);
		  // Getting the last item of the now sorted array (which represents the maximum, in other words: highest number)
	        int max = arr.length-1;
	     // reversing the order with a simple for-loop
	        System.out.println("Array in descending order:");
	        for(int i=max; i>=0; i--) {
	            System.out.println(arr[i]);
	        }
	          
}
}
