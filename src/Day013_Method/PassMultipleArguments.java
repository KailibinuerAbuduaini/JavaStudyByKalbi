package Day013_Method;

public class PassMultipleArguments {

	public static void main(String[] args) {
	
		showSum(5,10);
		showSum(6,50);
		showSum(4,30);
		showSum(9,130);
	}
   public static void showSum(int num1,int num2) {
	   System.out.println(num1+num2);
   }
}
