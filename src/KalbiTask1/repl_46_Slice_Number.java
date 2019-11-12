package KalbiTask1;

import java.util.Scanner;

public class repl_46_Slice_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your number:");
	  int	n1=sc.nextInt();
	  

		int digit1=n1/10000;
		n1=n1%10000;
		int digit2=n1/1000;
		n1=n1%1000;
		int digit3=n1/100;
		n1=n1%100;
		int digit4=n1/10;
		n1=n1%10;
		int digit5=n1;
		
	
		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit3);
		System.out.println(digit4);
		System.out.println(digit5);
	}

}
