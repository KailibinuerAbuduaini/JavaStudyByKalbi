package Repl_assignment_part_3;

import java.util.Scanner;

public class repl_93_Prefix_Again {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		String check=str.substring(0, n);
	int count=0;

		for (int i = 0; i < str.length() -(n-1); i++) {
			if (str.substring(i, i + n).equalsIgnoreCase(check)) {
				count++;
			}
		}
		if(count>1) {
			System.out.println(true);
		}
					
		else if (count<=1)	{
			System.out.println(false);
		}	
	}

}
