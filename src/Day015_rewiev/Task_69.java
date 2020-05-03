package Day015_rewiev;

public class Task_69 {

	public static void main(String[] args) {
		/*
		 * Write a method named isPrime which takes an integer as an argument and returns true if
           the argument is a prime number, or false otherwise.
          • Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all
           the other even numbers can be divided by 2
		 */
	
    int number = 11;
		
		if(isPrime(number)) {
			System.out.println(number + " is a prime number");
		}else {
			System.out.println(number + " is not a prime number");
		}
	}
	
	
	public static boolean isPrime(int number) {
		
		boolean  flag = true;
		
		if(number==0 || number ==1) {
			
			flag=false;
			
		}else {
			
			
			for(int i=2;i<number;i++) {
				
				if(number%i==0) {
					
					flag=false;
					
					break;
				}
				
			}
			
		
		}
		
		return flag;
	}

}
