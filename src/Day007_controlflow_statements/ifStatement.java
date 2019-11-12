package Day007_controlflow_statements;

public class ifStatement {

	public static void main(String[] args) {
		int score=80;
		if(score>=70) {
			System.out.println("Excelent");
			System.out.println("you passed with grade A");
		}
            System.out.println("kalbinur");
            
            int sales,bonus;
            double commisionRate,salary;
            
             sales=5000;
            salary=10000;
            if(sales>=5000) {
            	bonus=500;
            	commisionRate=1.12;
            	salary=salary*commisionRate+bonus;
            	 	
            }
             System.out.println("salary= " + salary);
	}

	
}
