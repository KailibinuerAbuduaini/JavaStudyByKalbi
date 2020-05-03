package Day024_array_part_1;

import java.util.Arrays;

public class Task_92_ozzy {

	public static void main(String[] args) {
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1; // i am putting element inside nums[] array , by i+1 , putting from 1 to 10;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] * 19);
		}

		System.out.println(Arrays.toString(nums));

	}

}
