package Repl_Assignment_part_5;

import java.util.Arrays;
import java.util.Scanner;

public class repl_146_Methods8_splitpersoninfo {
	/*
	 * The method person get a string with this format : "name,last name,age"
person("jon,doe,30");
the output is:person name: jon last name: doe age: 30
hint: use the split method to split the string to a string array where there is a "," char
	 */

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    String s = inp.next();
		    person(s) ;

	}

	 public static void person(String info) {
		
		   String[] str=info.split(",");
		 
		   
		  
		 String person_name=str[0];
		 String last_name=str[1];
		 String age=str[2];
		   

		 System.out.println("person name: "+person_name+" last name: "+last_name+" age: "+age);
		 
		   }
		 
			//your code here
			
		
		}//end person
