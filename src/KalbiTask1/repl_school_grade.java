package KalbiTask1;

import java.util.Scanner;

public class repl_school_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declare 6 String variables: subject1,  subject2, subject3,  subject4, subject5, summary;
//Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;
 Scanner scan=new Scanner(System.in);
 System.out.println("Welcome to the Grader!");
 System.out.println("Please enter subject name number 1 and score for this subject");
		String subject1=scan.next();
		double grade1=scan.nextDouble();
System.out.println("Please enter subject name number 2 and score for this subject");
		String subject2=scan.next();
		double grade2=scan.nextDouble();
		 System.out.println("Please enter subject name number3 and score for this subject");
		String subject3=scan.next();
		double grade3=scan.nextDouble();
		 System.out.println("Please enter subject name number 4 and score for this subject");
		String subject4=scan.next();
		double grade4=scan.nextDouble();
		 System.out.println("Please enter subject name number 5 and score for this subject");
		String subject5=scan.next();
		double grade5=scan.nextDouble();
		
		
		String summary=subject1+" - "+grade1+", "
		+subject2+" - "+grade2+", "
		+subject3+" - "+grade3+", "
		+subject4+" - "+grade4+", "
		+subject5+" - "+grade5;
		System.out.println("Summary: "+summary);
		
		double average=(int)(grade1+grade2+grade3+grade4+grade5)/5;
		System.out.println("Your average score is: "+average);
		System.out.println("Thank you for using Grader!");
		System.out.println("Goodbye!");
		
		
		
	}

}
