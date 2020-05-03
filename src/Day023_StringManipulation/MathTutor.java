package Day023_StringManipulation;

import java.util.*;

public class MathTutor {

	public static void main(String[] args) {
	
		int n1;
		int n2;
		int sum;
		int userAnswer;

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		n1 = rn.nextInt(100);
		n2 = rn.nextInt(100);
		System.out.println("what is the answetr to the following problem?");
		System.out.println(n1 + "+" + n2 + " = ?");
		userAnswer = sc.nextInt();
		sum = n1 + n2;
		if (userAnswer == sum) {
			System.out.println("correct");
		} else {
			System.out.println("you are wrong!15");
		}
	}

}
