
public class wages {

	public static void main(String[] args) {
		double regularWage; // the calculated regular wage
		double basePay=25;
		double regularHours=40;
		double overtimeWages;
		double overtimePay=37.5;
		double overtimeHours=10;
		double totalWage;
		
		regularWage=basePay*regularHours;
		overtimeWages=overtimePay*overtimeHours;
	
		totalWage=regularWage+overtimeWages;
				
		
		System.out.println("wage for this week are $" + totalWage);
		

	}

}
