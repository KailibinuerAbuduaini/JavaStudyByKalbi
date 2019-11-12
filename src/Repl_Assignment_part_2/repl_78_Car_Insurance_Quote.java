package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_78_Car_Insurance_Quote {

	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		// WRITE YOUR CODE HERE
		
		System.out.println("Enter your name");
		name = scan.nextLine();
		
		System.out.println("Do you have a US driver license?");
		vehicleUsage = scan.next();
		if (vehicleUsage.equalsIgnoreCase("NO")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		
		System.out.println("Enter your zip code");
		int zip_code = scan.nextInt();
		if (zip_code == 20910 || zip_code == 20740) {
			premium = premium + 60;
		} else if (zip_code == 22102 || zip_code == 22103) {
			premium = premium + 30;
		} else {
			premium = premium + 50;
		}
		
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();
		
		
		if (vehicleOwnership.equalsIgnoreCase("Owned")) {
			premium = premium + 10;
		} else {
			premium = premium + 20;
		}
		
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();
		if (vehicleUsage.equalsIgnoreCase("Business")) {
			premium = premium + 50;
		} else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
			premium = premium + 10;
		} else if (vehicleUsage.equalsIgnoreCase("Commute")) {
			premium = premium + 20;
			
			System.out.println(" how many days per week drives to work?");
			daysDrivenToWorkOrSchool = scan.nextInt();
			premium = premium + 5 * daysDrivenToWorkOrSchool;
			
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			premium = premium + (1 * milesToWorkOrSchool);

		}
		
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		
		  if (age >= 16 & age < 18) {
			premium = premium * 20;
		} else if (age >= 18 & age <= 21) {
			premium = premium * 6;
		} else if ((age > 21 & age < 25)) {
			premium = premium * 2;
		}else if(age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		}


		System.out.println("How many years you've been driving?");
		int year = scan.nextInt();
		if (year < 0 && (age-year)<=16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else {
			premium = premium - 5 * year;

		}
		
		System.out.println("Have you had any accidents in the last 5 years?");
		String answer = scan.next();
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium = premium + 0.2 * accidentsAmount*premium;
		}
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next();
		if (continuousInsurance.equalsIgnoreCase("no")) {
			premium = premium * 2;
		}
		
		System.out.println("What is the highest level of education you have completed?");
		education = scan.next();
		if (education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("master")
				|| education.equalsIgnoreCase("Bachelors")) {
			premium = premium - (0.5 * premium);
		} else if (education.equalsIgnoreCase("Doctors")) {
			premium = premium - (0.10 * premium);
		} else if (education.equalsIgnoreCase("Less than High School")) {
			premium = premium + (0.05 * premium);
		}
		System.out.println(name+" here's your quote!");
		System.out.println("Start Your Policy Today For: $"+premium);
		// DA25ID20910PHD
 referenceNumber=(name.substring(0,2)+age+(name.substring((name.length()-2)))+
		 zip_code+education.replace(" ",""));
		System.out.println("Reference number: "+ referenceNumber.toUpperCase());
		
	}
}