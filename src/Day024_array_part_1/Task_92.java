package Day024_array_part_1;

import java.util.Arrays;

public class Task_92 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to store numbers 1 to 10 in an array using data instantiation. Then write a
           for loop to multiply each member of above array by 19, this way you will get table of 19 stored
           in the above array. Finally write another for loop to print all the array elements.
		 */
		

		int [] numbers=new int[10];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=i+1;// array ning eliment lirini chiqirip beridu;
			// i am putting element inside nums[] array , by i+1 , putting from 1 to 10;
			System.out.println(numbers[i]*19);
		}

	System.out.println(Arrays.toString(numbers));

	}
}
