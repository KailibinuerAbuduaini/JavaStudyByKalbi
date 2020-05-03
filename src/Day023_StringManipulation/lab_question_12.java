package Day023_StringManipulation;

public class lab_question_12 {

	public static void main(String[] args) {
		//Return true if the string "cat" and "dog" appear the same number of times in the given string.

		String str = "acataaCatgdogggdog"; // counterCat
		// counterDog
		// substring(0,3) = i,i+3
		// substring(3,6) = i,i+3

		int counterCat = 0, counterDog = 0;

		for (int i = 0; i < str.length() - 2; i++) {

			if (str.substring(i, i + 3).equalsIgnoreCase("cat")) {
				counterCat++;
			}
			else if (str.substring(i, i + 3).equalsIgnoreCase("dog")) {
				counterDog++;
			}

		}

		if (counterCat == counterDog) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}