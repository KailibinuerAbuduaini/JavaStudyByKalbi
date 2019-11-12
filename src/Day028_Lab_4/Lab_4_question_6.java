package Day028_Lab_4;

import java.util.Arrays;

public class Lab_4_question_6 {
	/*
	 * Write a method that accepts an array and figure out which is greatest
	 *  element in the array, a and set all the other elements to be that
        value. Print the changed array.
	 */

	public static void main(String[] args) {
	
		int[] x = {1,2,3};
		System.out.println(Arrays.toString(greatestElement(x)));
		
	}
public static int[] greatestElement(int[] great) {
	
	int max=great[0];
	for(int i=0;i<great.length-1;i++) {
		if(great[i+1]>max) {
		max=great[i+1];
		}
		
	}
	for(int i=0;i<great.length-1;i++) {
		great[i]=max;
	}
	return great;
}
}
