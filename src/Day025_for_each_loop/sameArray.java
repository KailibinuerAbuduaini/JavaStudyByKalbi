package Day025_for_each_loop;

public class sameArray {

	public static void main(String[] args) {

		int[] array1 = { 2, 3, 4, 5, 6 };

		int[] array2 = array1;

		array1[0] = 200;
		
		array2[4] = 4000;
		System.out.println("the content of array1");
		for (int value : array1) {
			System.out.println(value);
		}
		System.out.println("the content of array2");
		for (int value : array2) {
			System.out.println(value);
		}
	}

}
