package Repl_Assignment_part_4;

import java.util.Scanner;

public class repl_095_Get_Sandwich {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     String between = "";
	     
	    
	     int lastBread = 0;
	     		int firstBreadEnd= 0;
	     		
	 
	     		// it has to check from start to end to find----->start of last bread
	     		for (int i = 0; i < str.length() - 4; i++) {
	     			if (str.substring(i, i + 5).equals("bread")) {
	     				lastBread = i;    // it will stop at last appearance of bread
	     				                  // so when i use substring, it should before this i;
	     			}
	     		}
	     	
	     		
	     		// it has to check from last to start to find---> end of first bread 
	     		for (int j = str.length(); j >= 5; j--) {  
	   		if (str.substring(j - 5, j).equals("bread")) {
	     				firstBreadEnd= j;    // it will find end of first bread
	     				                //  so when i use substring, it should after this j;
	     			}
	    
		
	     		if (lastBread>= 5) {    // it indicate this have two bread , so should >=5
	     			between = str.substring(firstBreadEnd,lastBread);
	     		} else {   // if only have one bread return nothing
	     			between = "nothing";
	     		}
	     		System.out.println(between);

	}

	}
}
