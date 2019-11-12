package Day007_controlflow_statements;

public class ifElsesatatement {

	public static void main(String[] args) {
		int score=60;
		if(score>=70) {
			System.out.println("excelent");
		}else {System.out.println("failed");
		}
		
		int sales,bonus;
		double commisionRate, salary;
		
		sales = 5000;
		salary = 10000;
		
		if (sales>5000) {
			bonus =500;
			commisionRate = 1.12;}
			
		else {bonus =100;
			commisionRate = 1.10;
			
			}
			
			salary = salary * commisionRate + bonus;
		
		
		System.out.println("Salary = " + salary);

	}
	

}
