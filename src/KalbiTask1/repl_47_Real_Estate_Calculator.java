package KalbiTask1;

import java.util.Scanner;

public class repl_47_Real_Estate_Calculator {

	public static void main(String[] args) {
	/*
	 * Write a program that will estimate your property price. 
       This program should work with 3 house types: Condo, Townhouse and Single Family Home. 
       Starting price for Condo = 50000, 
       for Townhouse = 75000, Single Family Home = 95000.
	 */
		
		
		
		
		int propertyPrice = 0;
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");

		System.out.println("Enter your property type:");
		houseType = scan.nextLine();

		if (houseType.equals("Condo")) {
			propertyPrice = 50000;
		} else if (houseType.equals("Townhouse")) {
			propertyPrice = 75000;
		} else if (houseType.equals("Single Family Home")) {
			propertyPrice = 75000;
		}
		
		/*
		 * Based on number of bedrooms, add to the price of your property 30000 for every bedroom. 
		 * Then you need to ask if property has backyard. Add 5000 to the property price if it's true.
		 *  Backyard shouldn't be available for Condo, so display message "Backyard is not available for condo!",
		 *  (don't increase property price!), in case someone would try to select backyard for condo.
		 */
		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms = scan.nextInt();
		if (numberOfBedrooms >= 1) {
			propertyPrice = propertyPrice + numberOfBedrooms * 30000;
		}
		
		System.out.println(propertyPrice);

		System.out.println("Do you have a backyard?");
		backyard = scan.nextBoolean();
		if (backyard  && !houseType.equals("Condo")) {
			propertyPrice = propertyPrice + 5000;
		} else {
			System.out.println("Backyard is not available for condo!");
		}
		
		System.out.println(propertyPrice);
		
		/*
		 * Then ask user for garage presence. If the property has garage,
		 *  add 20000 to the property price for every spot.
		 *  If amount of garage spots exceeds 10 spots (grater then 10), 
		 * display message: " Pardon,  it's not a public parking!" and don't increase property price. 
		 */
		System.out.println("Do you have garage?");
		garage = scan.nextBoolean();

		System.out.println("How many spots?");
		garageSpots = scan.nextInt();

		if (garage) {

			if (garageSpots >= 10) {
				System.out.println("Pardon, it's not a public parking!");
			} else {
				propertyPrice = propertyPrice + garageSpots * 20000;
			}

		}
		
		System.out.println(propertyPrice);
		
		/*
		 * Then, ask user for metro accessibility. If metro is closer than 1 mile (inclusive), 
		 * add to the property price 10000. If metro is in the radius from 1 mile to 3 miles, 
		 *  add to the property price 5000.  Then, ask user for highway accessibility. 
		 *  If highway is closer than 1 mile (inclusive), add to the property price 15000. 
		 *  If highway is in the radius from 1 to 5 miles,  add to the property price 8000.
		 *   And if highway is in the radius from 5 mile to 20 miles (inclusive),  add to the property price 4000. 
		 */
		
		System.out.println("How close is metro station?");
		metroAccessibility = scan.nextFloat();
		if (metroAccessibility <= 1) {
			propertyPrice = propertyPrice + 10000;
		} else if (metroAccessibility > 1 && metroAccessibility < 3) {
			propertyPrice = propertyPrice + 5000;
		}
		
		System.out.println(propertyPrice);
		
		
		System.out.println("How close is highway?");
		highwayAccessibility = scan.nextFloat();
		if (highwayAccessibility <= 1) {
			propertyPrice = propertyPrice + 15000;
		} else if (highwayAccessibility > 1 && highwayAccessibility < 5) {
			propertyPrice = propertyPrice + 8000;
		} else if (highwayAccessibility >= 5 && highwayAccessibility <= 20) {
			propertyPrice = propertyPrice + 4000;
			
		}
		
		System.out.println(propertyPrice);
		/*
		 * Then your program should ask about nearest school rating.
		 *  If school's rating is in the range from 10 (inclusive) to 8 points, 
		 *   add to the property price 45000. If school's rating is less than 8 points and more or equals to 4 points,  
		 *   add to the property price 20000. Otherwise, add 5000 to the property price.  
		 *   Then, ask user if any of the family members smoking. If so, reduce property price for 5000.
		 *    At the end, display message: "Market report has been generated.", 
		 *    and display underneath:  "Your estimate market price is: propertyPrice$" 
		 */
		
		System.out.println("What's the rating of nearest school?");
		schoolScore = scan.nextFloat();
		if (schoolScore > 8 && schoolScore <= 10) {
			propertyPrice = propertyPrice + 45000;
		} else if (schoolScore >= 4 && schoolScore < 8) {
			propertyPrice = propertyPrice + 20000;
		} else {
			propertyPrice = propertyPrice + 5000;
		}
		
		
		System.out.println(propertyPrice);
		
		
		System.out.println("Does any of your family members smoking?");
		smoking = scan.nextBoolean();
		if (smoking == true) {
			propertyPrice = propertyPrice - 5000;
		} else if (smoking == false) {

		}
		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is: " + propertyPrice + "$");
	}
}