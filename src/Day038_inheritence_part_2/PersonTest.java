package Day038_inheritence_part_2;

public class PersonTest {

	public static void main(String[] args) {
		Student s=new Student();
		s.display();

	}

}
class Person{
	public void message() {
		System.out.println("this is person class");
	}
}
class Student extends Person{
	public void message() {
		System.out.println("this is student class");
	}
	public void display() {
		message();
		super.message();
	}
}
