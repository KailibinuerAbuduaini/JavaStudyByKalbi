package Day006_Logical_operators;

public class logical_Operators {

	public static void main(String[] args) {
		 
		char c1 = 'A';
		char c2 = 65;
		int i1 = 5;
		int i2 = 10;
		
		boolean res1=(i1==i2)&(c1==c2);  // F & T = F
		boolean res2=(i1==i2)&&(c1==c2); // F && ---- = F
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		
		boolean res3 = (c1==c2)|(i1==i2); // T | F = T
		boolean res4 = (c1==c2)||(i1==i2); // T || ------ = T
		
		System.out.println("res3 = " + res3);
		System.out.println("res4 = " + res4);
		
		boolean res5 = (c1==c2)^(i1==i2); // T ^ F = T
		boolean res6 = (c1==c2)^(i1!=i2); // T ^ T = f
		
		System.out.println("res5 = " + res5);
		System.out.println("res6 = " + res6);

		int applesCount = 20;
		int orangesCount = 30;
		int pearsCount = 30;
		
		boolean comp = applesCount<orangesCount||orangesCount>=pearsCount; 
		
		// 20<30 || 30>=30 = > T || ---- = T
		
		System.out.println(comp);
    
		String outsideWeather;
		int degree;
		outsideWeather="Shinny";
		degree=70;
		
		boolean comp2 = (!(outsideWeather=="Rainy" || degree==70)); //(!(F||T) = > !T = > false
		
		System.out.println(comp2);
		
		int b=2;
		boolean res =++b ==2||--b ==2&&--b==2;
		System.out.println(res);
		
		double x=20;
		double y=80;
		double z=(x+y)*25;
		double res12=40%3;
		double remainder =res12%40;
		System.out.println("remaining total is equal to 20 or less?-" + (remainder<=20));
		
	
		
		
		
		
		
		








		
		
		
		
		

	}

}
