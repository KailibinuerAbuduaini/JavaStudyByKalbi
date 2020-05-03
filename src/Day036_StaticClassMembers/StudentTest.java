package Day036_StaticClassMembers;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student("mike",30,34656);
		Student s2=new Student("kelly",25,6256);
		Student s3=new Student("xahida",15,7656);
		Student s4=new Student("kamar", 35, 12121);
		s1.School="cybertek3";
		s2.School="kaxkar";// you should notice this change
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
		// you can access static varibale through the class name
		System.out.println(Student.School);
		
		// how come we are calling some  method or variables without create object only with class name?
		// because they are static
		Math.round(10);// because round  this is static so we can call this without create round object.
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println(Student.school);
		
		
		
		

	}

}
