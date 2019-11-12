package Repl_assignment_part_3;

import java.util.Scanner;

/*
 * Given a string, print out true if the number of appearances of "java" anywhere in the string is equal 
 * to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */

public class repl_97_Equals_java_python {
	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		    
		   int java_count=0;
		   int python_count=0;
		   
		   for(int i=0;i<sentence.length()-3;i++) {
		   if(sentence.substring(i,i+4).equalsIgnoreCase("java")) {
			   java_count++;
		   }
		   }
			  System.out.println(java_count);
	   

		   for(int j=0;j<sentence.length()-5;j++) {
			   if(sentence.substring(j,j+6).equalsIgnoreCase("python")) {
	   
			   python_count++;
               
			   }
		   }
		   System.out.println(python_count);
	
		   
		   
		   if(java_count==python_count||if(java_count>python_count||java_count<python_count||java_count==1||python_count==1)) {
			   System.out.println(true);
		   }else if(java_count!=python_count) {
			   System.out.println(false);
	   }
	   
		   }
		   }
		   
	

