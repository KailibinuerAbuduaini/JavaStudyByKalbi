package Day029_Lab_4;
import java.util.Arrays;

public class q_29_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	

	int[] x = {2,10,3,4,20,5};
	int[] s = {10,1,20,2};
	System.out.println(Arrays.toString(change(x)));
	System.out.println(Arrays.toString(change(s)));

	}

public static int[] change(int[] arr) {
	boolean a = false;
	int b = 0;
	int[] newArr = new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		if(a) {
			if(arr[i]% 10 != 0) {
				
				newArr[i] = b;
			}else {
				newArr[i] = arr[i];
				b = newArr[i];
			}
			
		}else if(arr[i]%10 == 0) {
			newArr[i] = arr[i];
			b = newArr[i];
			a = true;
		}else {
			newArr[i] = arr[i];
		}
		
	}
	return newArr;
}
}