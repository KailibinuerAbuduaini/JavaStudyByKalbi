package Day015_rewiev;

public class Task_67 {

	public static void main(String[] args) {
		//Write a method that accepts 2 numbers and return if they have the same last digit
		
		if(lastDigit(14,114)) {
			System.out.println("They have the same last digit");
		}else {
			System.out.println("They do not have the same last digit");
		}
		
		
	}

	public static boolean lastDigit(int num1, int num2) {
		
			if((num1%10)==(num2%10)) {
				return true;
			}else {
				return false;
			}
	  
  }
}
