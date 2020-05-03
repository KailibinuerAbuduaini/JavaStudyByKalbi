package Repl_Assignment_part_6;

public class repl_176_Method_Overloading_1 {

	public static void main(String[] args) {
		
		int[] a = { 20, 30, 50, 4, 71, 200};
		double[] c = { 2.0, 3.0, 5.0, 4, 71, 20.0};
		findMax(c);
	}

public static int findMax(int[]arr) {
	
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>max) {
			max=arr[i];
		}
		
	}

	return max;
}
public static double findMax(double[] arr) {
	
	double max=arr[0];
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]>max) {
			max=arr[i];
		}
		
	}
	
	return max;
}


}
