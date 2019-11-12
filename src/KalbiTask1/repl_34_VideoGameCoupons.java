package KalbiTask1;

import java.util.Scanner;

public class repl_34_VideoGameCoupons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		int coupons = scan.nextInt();

		if (coupons >= 3 && coupons < 1113) {
			int candies = coupons / 10;
			coupons = coupons % 10;
			int Gumballs = coupons / 3;
			coupons = coupons % 3;

			System.out.println("Number of Candies:" + candies);
			System.out.println("Number of Gumballs:" + Gumballs);

		} else if (coupons < 3) {
			System.out.println("Not enough coupons");
		}
	}
}
