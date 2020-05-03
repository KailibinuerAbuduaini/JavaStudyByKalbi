package Day035_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee("mike",39119);
		Employee e3=new Employee("ted brit",81775,"sales","sales person");
		System.out.println(e1.getName()+"|"+e1.getIdNumber()+"|"+e1.getDepartment()+"|"+e1.getPosition());
		System.out.println(e2.getName()+"|"+e2.getIdNumber()+"|"+e2.getDepartment()+"|"+e2.getPosition());
		System.out.println(e3.getName()+"|"+e3.getIdNumber()+"|"+e3.getDepartment()+"|"+e3.getPosition());
		
		e1.setName("jack");
		e1.setIdNumber(4678);
		e1.setDepartment("accounting");
		e1.setPosition("VP");
		System.out.println(e1.getName()+"|"+e1.getIdNumber()+"|"+e1.getDepartment()+"|"+e1.getPosition());
	}

}
