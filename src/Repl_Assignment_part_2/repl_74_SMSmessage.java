package Repl_Assignment_part_2;
/*
 * Instructions from your teacher:
We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line
 */

import java.util.Scanner;

public class repl_74_SMSmessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	   
		   String message = scan.nextLine();
		    String sender;
		    String phoneNumber;
		    String messageBody;
		    int dot=message.indexOf(".");
		    int dot_dot=message.indexOf(":");
		    
		    int big_sign1=message.indexOf("<");
		    int big_sign2=message.indexOf(">");
		     sender=message.substring(0, big_sign1);
		     String name=message.substring((big_sign1+1),(big_sign2));
		    System.out.println("Sender: "+name);
		    
		    int bricket1=message.indexOf("[");
		    int bricket2=message.indexOf("]");
		    phoneNumber=message.substring(bricket1+1,bricket2);
		    
		    System.out.println("Phone Number: "+phoneNumber);
		    
		    int curly1=message.indexOf("{");
		    int curly2=message.indexOf("}");
		    messageBody=message.substring(curly1+1,curly2);
		    System.out.println("Message body: "+messageBody);
		    
		    
 
	}

}
