package KalbiTask1;

import java.util.Scanner;

public class repl_36_Apartment_Leasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Cybertek Apartments!");
	    System.out.println("Number of bedrooms you are interested:");
	    int numberOfBedrooms = scan.nextInt();
	    int startingPrice=0;
	    
	    switch(numberOfBedrooms) {
	    case 1:
	    System.out.println("One Bedroom Selected");

	    startingPrice=1100;
	    break;
	    
	    case 2:
	    	System.out.println("Two Bedroom Selected");
	    	 startingPrice=1850;
	    break;
	    
	    case 3:
	    System.out.println("Three Bedroom Selected");
	    startingPrice=2550;
	    
	    break;
	    default:
	 System.out.println("No such Bedrooms available");
	
	
}
System.out.println("startingPrice:"+startingPrice);
	}
}



//numberOfBedrooms is 1
//	print "One Bedroom Selected"
//	set startingPrice as 1100
//
//numberOfBedrooms is 2
//	print "Two Bedroom Selected"
//	set startingPrice as 1850
//
//numberOfBedrooms is 3
//	print "Three Bedroom Selected"
//	set startingPrice as 2550
//
//All other inputs:
//	print "No such Bedrooms available"
//	
//
//Print "Starting Price: value"