package Day025_for_each_loop;

import java.util.Scanner;

public class PassArray2 {

	public static void main(String[] args) {

		int[] numbers = new int[5];
		getValue(numbers);
		System.out.println("here are numbers");

		showArray(numbers);
	}

	public static void showArray(int[] array) {
		
		for (int value : array) {
			System.out.println(value);
		}
	}

	
	public static void getValue(int[] array) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a series of " + array.length + " numbers");
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter number " + (i + 1) + ":");
			array[i] = sc.nextInt();
		}

	}

}
