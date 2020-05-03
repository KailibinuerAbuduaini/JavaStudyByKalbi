package Day037_Inheritence;

public class Company {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.name="jack";
		emp1.jobTitle="teacher";
		emp1.age=27;
		emp1.gender='M';
        emp1.work();
        System.out.println(emp1.toString());
		emp1.eat("polo");
		
	}

}
