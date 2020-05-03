package Day036_StaticClassMembers;

public class Student {
	String name;
	int age;
	int idNumber;
	// String School="cybertek2";  this is instance variable , and you can access instance variable only through object
	// if you did not put static , that school is only  belongs to class not object,so you can call through class name 
	
	
 String School="cybertek2";// but now this is static , so you can access static variable  either class name or object
	
	public Student(String name, int age, int idNumber) {
		
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;

	}




	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", School=" + School + "]";
	}
	

}
