package Day008_controlFlowStatements_Part2;

public class smalltask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 20;
		int x = 180;
		if (x > 100) {
			y = 20;
		} else {
			y = 0;
		}
		System.out.println("x+" + y);

		if (y == 100) {
			x = 1;
		} else {
			x = 0;
		}
		System.out.println("x=" + x);

		//
		int a = 0;
		int b = 0;
		int c = 0;

		if (a < 10) {
			b = 0;
			c = 1;

		} else {
			b = 99;
			c = 0;
		}
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		//
		int d = 50;
		int f = 100;
		if (d > f) {
			System.out.println("d is greater than f");
		} else {
			System.out.println("f " + f + " is greater than d" + d);

			//

			int r = 22;

			if (r % 2 == 0) {
				System.out.println("r is even number");
			} else {
				System.out.println("r is odd number");
			}

			//

			int a1 = 65;
			int a2 = 45;
			int a3 = 70;

			if ((a1 + a2 + a3) == 180) {
				System.out.println("this is a triangle");
			} else {
				System.out.println("this not valid");
			}
			
			
		}
	}
}
