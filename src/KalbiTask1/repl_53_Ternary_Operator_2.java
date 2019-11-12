package KalbiTask1;

import java.util.Scanner;

public class repl_53_Ternary_Operator_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
			
			System.out.println((num1>num2) ? (num1):(num2));
	}

}
