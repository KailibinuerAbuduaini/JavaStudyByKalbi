package Day028_Lab_4;

import java.util.Arrays;

public class question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]x= {1,2,3};
int[]y= {11,2,13,3};

System.out.println(Arrays.toString(acceptArr(x)));
System.out.println(Arrays.toString(acceptArr(y)));
	}
public static int[] acceptArr(int[]a) {
	int b=0;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]==2&&a[i+1]==3) {
			a[i+1]=b;
		}
	}
	return a;
	
}
}
