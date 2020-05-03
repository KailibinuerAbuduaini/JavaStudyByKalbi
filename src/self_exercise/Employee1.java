package self_exercise;

public class Employee1 {

	float salary = 40000;
}

class Programmer extends Employee1 {
	int bonus = 10000;

	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		System.out.println("programmer salary is " + p1.salary);
		System.out.println("programmer bonus is " + p1.bonus);

	}

}
