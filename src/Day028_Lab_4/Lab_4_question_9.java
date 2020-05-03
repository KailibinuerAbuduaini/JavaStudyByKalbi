package Day028_Lab_4;

import java.util.Arrays;

public class Lab_4_question_9 {

	public static void main(String[] args) {
		
int[]x= {1,2,3,4,5};
System.out.println(Arrays.toString(x));
	}
public static int[] newArr(int[]a) {
	int[]newArray= new int[2*a.length];
	newArray[newArray.length-1]=a[a.length-1];
	return newArray;
	}
}

