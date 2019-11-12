package Assaignments;

import java.util.Scanner;

public class assignment_6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		int counterHalfCentury=0;
		int counterDouble=0;
		int counterCentury=0;
		
		for(short value:scores) {
			
			if(value>=50&&value<100) {
				counterHalfCentury++;
				
			}else if(value>=100&&value<200) {
				counterDouble++;
			}else if(value>=200) {
				counterCentury++;
				
			}
		}
		System.out.println("double-century:"+counterDouble);
		System.out.println("half-century:"+counterHalfCentury);
		System.out.println("century: "+counterCentury);
	}

}
