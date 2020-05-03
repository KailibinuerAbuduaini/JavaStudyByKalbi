package Day038_inheritence_part_2;

public class FullTimeEmployee extends Employee{
	//override
	public void CalculatePay(int hours,double rate) {
		double total=(hours*rate)*1.05;
		System.out.println("FullTimeEmployee total pay :"+total);
	}

}
