package Day036_StaticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
		
		
		// in here we call plus method use class name Calculater
	double result =Calculater.plus(55,7 );// static way
	System.out.println("result"+result);
	
	// in here we call  plus method with object name c
	Calculater c=new Calculater();
	System.out.println(c.plus(55,7));
	
	int i=Integer.parseInt("33");
	System.out.println(Character.isDigit('5'));
	

	}

}
