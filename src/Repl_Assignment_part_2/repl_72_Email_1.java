package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_72_Email_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		  //  mike_tyson@gmail.com
		    if (email.contains("_")) {
		    String first_name=email.substring(0,email.indexOf("_"));
		    String last_name=email.substring((email.indexOf("_")+1),email.indexOf("@"));
		    String last_part=email.substring(email.indexOf("@"));
		   
		    System.out.println(last_name+"_"+first_name+last_part);
		    
		    }else {
		    	System.out.println(email);
		    }
	}

}
