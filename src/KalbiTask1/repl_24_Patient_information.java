package KalbiTask1;

import java.util.Scanner;

public class repl_24_Patient_information {

	public static void main(String[] args) {
		
		
//		firstName, lastName, fullName, email, street, state, city, address, contacts.
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		
		System.out.println("Enter your first name");
		String firstName=scan.nextLine();
		System.out.println("Enter your last name");
		String lastName=scan.nextLine();
		System.out.println("Enter your email");
		String  email=scan.nextLine();	
		
		String fullName=firstName+","+lastName;

		
		System.out.println("Enter your street");
		String street=scan.nextLine();
		System.out.println("Enter your city");
		String city=scan.nextLine();
		System.out.println("Enter your state");
		String state=scan.nextLine();
		System.out.println("Enter your zip code");
		int zipCode=scan.nextInt();
		
		String address=street+", "+city+", "+state+", "+zipCode;
		
		
			
		System.out.println("Enter your work phone number");
		long work_Number=scan.nextLong();
		System.out.println("Enter your personal phone number");
		long  personal_Number=scan.nextLong();
		//work phone number - 7896542314, personal phone number - 2406542314,
		
String contacts="work phone number -"+work_Number+","+"personal phone number-"+personal_Number+", "+"email:"+email;
		
		

		
		System.out.println("Enter your age:");
		int age=scan.nextInt();
		System.out.println("Enter your height:");
		double height=scan.nextDouble();
		System.out.println("Enter your weight:");
		double  weight=scan.nextDouble();
		System.out.println("Are you married?");
		 boolean married=scan.nextBoolean();
		
		System.out.println("Patient personal information");
		System.out.println("FullName "+fullName);
		System.out.println("Address " +address);
		System.out.println("Contacts:"+contacts);
		
		System.out.println("Age "+age);
		System.out.println("Height"+height);
		System.out.println("Weight:"+weight+" pounds");
		System.out.println("Married?:"+married);
		
	
		

		 
	
		

	
		
	}

}
