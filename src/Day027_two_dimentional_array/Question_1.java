package Day027_two_dimentional_array;

public class Question_1 {

	public static void main(String[] args) {
		//Write a method that accepts an array and return true if 6 appears as either the first or
		//last element in the array. The array will be length 1 or more.
		int[]x= {1,2,6};
		acceptArray(x);
	}
public static int[] acceptArray(int[] array) {
	
	for(int i=0;i<array.length;i++) {
		if(array[i]==6) {
			System.out.println(true);
		}
	}
	return array;
}
}
