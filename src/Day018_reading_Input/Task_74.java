package Day018_reading_Input;

import java.util.Scanner;

public class Task_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;

		do {

			System.out.print("Enter your number:");
			num = sc.nextInt();

			for (int i = 1; i <= 5; i++) {
				sum = sum + num;

			}
			if (num < 0) {
				break;
			}
		} while (num > 0  );
		System.out.println("Total is:" + sum);

	}
}