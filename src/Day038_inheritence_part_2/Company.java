package Day038_inheritence_part_2;

public class Company {

	public static void main(String[] args) {
		Employee emp=new Employee();
	
		FullTimeEmployee ft= new FullTimeEmployee();
		
		Contactor ct=new Contactor();
		emp.CalculatePay(40,40 );
		ft.CalculatePay(40,40 );
		ct.CalculatePay(40,40 );
		
	}

}
