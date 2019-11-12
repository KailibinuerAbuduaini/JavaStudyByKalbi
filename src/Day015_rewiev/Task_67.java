package Day015_rewiev;

public class Task_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(lastDigit(3,113)) {
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
