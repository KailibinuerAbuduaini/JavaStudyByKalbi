package Day037_Inheritence;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int questions;
		int missed;
		System.out.println("how many questions are on the exam?");
		questions=sc.nextInt();
		System.out.println("how many questions did the student missed?");
		missed=sc.nextInt();
		// 
		
		
		FinalExam s1=new FinalExam(questions, missed);
		
		s1.getGrade();
		System.out.println("The grade of this exam is "+s1.getGrade());

	}

}
