package Day033_Classes_Objects_constructures;

public class Student {
String name;
int age;
String school;
String course;
char gender;
int year;



	

	
	

	public Student(String name, int age, String school, String course, char gender, int year) {
	
	this.name = name;
	this.age = age;
	this.school = school;
	this.course = course;
	this.gender = gender;
	this.year = year;

	attendLab();
	submitAssignment();
	attendlecture() ;

	}
	public void attendLab() {
		System.out.println(name+"attending");
		
	}
	public  void submitAssignment() {
		System.out.println(name+"assigning ");
	}
	public void attendlecture() {
		System.out.println(name+"is attending");
	}


}
