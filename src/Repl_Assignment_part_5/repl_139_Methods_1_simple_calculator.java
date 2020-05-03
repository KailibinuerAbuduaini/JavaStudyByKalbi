package Repl_Assignment_part_5;

import java.util.Scanner;

public class repl_139_Methods_1_simple_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		plus();
	}
	public static void plus() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number:");
		
		int fisrt_num=scan.nextInt();
		System.out.println("enter second number:");
		int second_num=scan.nextInt();
		
		int sum=fisrt_num+second_num;
		System.out.println("result: "+sum);
		
	}

}
