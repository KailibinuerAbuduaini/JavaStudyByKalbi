package Day037_Inheritence;

public class School {
	public static void main(String[] args) {
		Person person= new Person();
		Student student=new Student();
		person.name="mike";
		person.age=35;
		person.gender='M';
		
		
		student.name="ggg";
		student.age=22;
		
		student.gender='M';
		
		person.eat("kebab");
		student.eat("pizza");
		student.code(lang);
	}

}
