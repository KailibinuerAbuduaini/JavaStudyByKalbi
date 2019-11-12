package KalbiTask1;

import java.util.Scanner;

public class repl_57_Find_a_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name:");
		String full_name=scan.nextLine();
		
		if(full_name.equalsIgnoreCase("Max Payne")||full_name.equalsIgnoreCase("Alan Wake")) {
			System.out.println("User found!");
		}else  {
			System.out.println("User not found!");
		}
		}
	
}
