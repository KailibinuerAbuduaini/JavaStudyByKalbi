package Day038_inheritence_part_2;

public class Contactor extends Employee{

	@Override
	public void CalculatePay(int hours, double rate) {
		double total=(hours*rate)+200;
		System.out.println("FullTimeEmployee total pay :"+total);
	}
	

}
