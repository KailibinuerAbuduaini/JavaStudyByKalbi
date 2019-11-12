package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_73_Email_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    
		    int at=email.indexOf("@");
		    int under=email.indexOf("_");
		    int dot=email.indexOf(".");
		    String first_name=email.substring(0, under);
		    String last_name=email.substring((under+1), at);
		    String Domain_part=(email.substring(at+1,dot));
		    
		    String last_part=(email.substring(dot+1));
		    String a=(first_name.substring(0,1).toUpperCase())+first_name.substring(1,first_name.length());
		    String b=(last_name.substring(0,1).toUpperCase()+last_name.substring(1,last_name.length()));
		    System.out.println("First name: "+a);
		    System.out.println("Last name: "+b);
		    System.out.println("Domain: "+Domain_part);
		    System.out.println("Top-Level Domain: "+last_part);
		    
          
		 

	}

}
