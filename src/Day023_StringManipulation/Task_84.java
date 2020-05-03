package Day023_StringManipulation;

import java.util.Random;

public class Task_84 {

	public static void main(String[] args) {
		
		Random rn = new Random();

	

		for (int i = 0; i < 10; i++) {
			int coin = rn.nextInt(2);
			if (coin == 1) {
				System.out.println("Tails");
			} else {
				System.out.println("Heads");
			}

		}
	}

}
