package self_exercise;

import java.util.Arrays;

public class Q_array_5 {

	public static void main(String[] args) {
		int[] x= {1,2,3,4};
		System.out.println(Arrays.toString(Ro(x)));

	}
public static int[] Ro(int[]a) {
	int x=a[0];
	for(int i=0;i<a.length-1;i++) {
		a[i]=a[i+1];
	}
	a[a.length-1]=x;
	return a;
}

}
