package KalbiTask1;

import java.util.Scanner;

public class repl_48_three_nums {

	public static void main(String[] args) {
		/*
		 * in this problem you need to write a program that checks for the bigger of 3 numbers.
           you get 3 int variables: n1 , n2 and n3
          if n1 is biggest output: "n1 is bigger"
          if n2 is biggest output: "n2 is bigger"
          if n3 is biggest output: "n3 is bigger"
		 */
		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is bigger");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("n2 is bigger");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("n3 is bigger");
		}
	}

}
