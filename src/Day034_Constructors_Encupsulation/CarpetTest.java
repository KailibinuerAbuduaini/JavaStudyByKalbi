package Day034_Constructors_Encupsulation;

public class CarpetTest {

	public static void main(String[] args) {
	   
		Floor f1=new Floor(10,12);
		Carpet c1=new Carpet(8);
		
		Calculator c=new Calculator(f1,c1);
	
		System.out.println(c.getTotalCost());
		
		
		
		
		Floor f2=new Floor(20,12);
		Carpet c2=new Carpet(10);
		Calculator c3=new Calculator(f2,c2);
		c3.getTotalCost();
		System.out.println(c3.getTotalCost());
		
	}

}
