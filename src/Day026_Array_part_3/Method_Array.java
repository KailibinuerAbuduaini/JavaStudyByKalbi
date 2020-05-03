package Day026_Array_part_3;

import java.util.Random;

public class Method_Array {

	public static void main(String[] args) {
		
		printArray(10);
	}

	public static int[] createArray(int arraySize) {
		Random rn = new Random();
		int[] myArray = new int[arraySize];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rn.nextInt(100);
		}
		return myArray;
	}

	public static void printArray(int number) {
		for (int value : createArray(number)) {
			System.out.println(value);
		}
	}
}
