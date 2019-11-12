package Day023_StringManipulation;

import java.util.Random;

public class Task_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();

		int coin = rn.nextInt(2);

		for (int i = 0; i < 10; i++) {

			if (coin == 0) {
				System.out.println("Tails");
			} else {
				System.out.println("Heads");
			}

		}
	}

}
