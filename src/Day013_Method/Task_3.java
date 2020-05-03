package Day013_Method;

public class Task_3 {

	public static void main(String[] args) {
		
      int x=5; int y=10;
	      
	        Pay(5,10);
	}
	
	public static void Pay(int x,int y) {
		int pay=x*y;
	System.out.println(pay);
     	calculator(4,3,"+");
		birthyear(2019,1989);
	}
		public static void calculator(int num1,int num2,String operator) {
			
			switch(operator) {
			case"*":
				System.out.println(num1*num2);
				break;
			case"+":
				System.out.println(num1+num2);
				break;
		case"/":
			System.out.println(num1/num2);
				break;
			case"-":
				System.out.println(num1-num2);
				break;
			}
		 
			}
	public static void birthyear(int current_year,int year) {
		int AGE=current_year-year;
		System.out.println(AGE);
		
	}
		}
	

