package Day005_unary_assignment_relational_Operators;

public class mixInteger {

	public static void main(String[] args) {
		int i1=5;
		int i2=10;
		float f1=15.5f;
		double d1=20.5;
		
		int res1=i1+i2;
		float res2=i1+f1;
		double res3=i2+d1;
		
		short firstNum=10;
		short secondNum=20;
		int thirdNum=firstNum+secondNum;
		short thirdNum2=(short)(firstNum+secondNum);
		
		//byte b1=20;
		//byte b2=2;
		//byte b3=(byte)(b1*b2);
		
		int b1=20;
		int b2=30;
		byte res =(byte)(b1+b2);// casting is required
		byte res2 =126 + 1;// no casting is required
				

	}

}
