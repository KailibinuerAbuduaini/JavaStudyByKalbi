package self_exercise;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * final int employees=3; int[] hours = new int[employees]; Scanner sc=new
		 * Scanner(System.in);
		 * System.out.println("enter the hours worked by "+employees+"employee.");
		 * System.out.println("employee1:"); hours[0]=sc.nextInt();
		 * System.out.println("employee2:"); hours[1]=sc.nextInt();
		 * System.out.println("employee3:"); hours[2]=sc.nextInt();
		 * System.out.println("The hours you entered are:");
		 * System.out.println(hours[0]); System.out.println(hours[1]);
		 * System.out.println(hours[2]); }
		 */
		int[] x = { 1, 2, 6 };
		int[] y = { 6, 3, 6 };
		System.out.println(arrayAccept(x));

		int[] z = { 1, 2, 1 };
		int[] d = { 3, 4, 8, 9, 3 };
		System.out.println(checkLength(z));

	}

	public static boolean arrayAccept(int[] arr) {
		if (arr.length < 1) {
			return false;
		} else if (arr[0] == 6 || arr.length - 1 == 6) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkLength(int[] L1) {
		if (L1.length < 1) {
			System.out.println("invalid");
		}
		if (L1.length > 1) {
			if (L1[0] == (L1.length - 1)) {
				return true;

			} else {
				return false;
			}

		}
	}

}
