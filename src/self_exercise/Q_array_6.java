package self_exercise;

import java.util.Arrays;

public class Q_array_6 {

	public static void main(String[] args) {
		int[] x = {1,2,3};
		System.out.println(Arrays.toString(Great(x)));
	}
	
public static int[] Great(int[] a) {
	int great=a[0];
	for(int i=0;i<a.length-1;i++) {
		if(a[i+1]>great) {
			great=a[i+1];
		}
	}
	for(int i=0;i<a.length-1;i++) {
		a[i]=great;
	}
	return a;
}
}
