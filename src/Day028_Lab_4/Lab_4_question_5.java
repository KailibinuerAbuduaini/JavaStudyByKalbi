package Day028_Lab_4;

import java.util.Arrays;

public class Lab_4_question_5 {

	public static void main(String[] args) {
		
		
		int[]x= {1,2,3};
				
	System.out.println(Arrays.toString(rotatedLeft(x)));
	
	}
public static int[] rotatedLeft(int[]R1) {
	int x=R1[0];
	for(int i=0;i<R1.length-1;i++) {
		
		R1[i]=R1[i+1];
	}
	R1[R1.length-1]=x;
	return R1;
}

}