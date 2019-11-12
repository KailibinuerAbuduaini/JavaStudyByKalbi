package Day024_array_part_1;

import java.util.Arrays;

public class Task_92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []numbers=new int[10];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=i+1;// array ning eliment lirini chiqirip beridu;
			System.out.println(numbers[i]*19);
		}

	System.out.println(Arrays.toString(numbers));

	}
}
