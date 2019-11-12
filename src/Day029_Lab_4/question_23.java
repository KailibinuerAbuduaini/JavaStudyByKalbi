package Day029_Lab_4;

import java.util.Arrays;

public class question_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
arr(5);
System.out.println(Arrays.toString(arr(5)));
	}
public static int[] arr(int a){
	int [] myArray=new int[a];
	for(int i=0;i<myArray.length;i++) {
		myArray[i]=i;
	}
	return myArray;
}
}

}