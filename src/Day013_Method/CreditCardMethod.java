package Day013_Method;

public class CreditCardMethod {

	public static void main(String[] args) {
		
		double salary=50000;
		int creditRating=9;
		
		if(salary>=20000&&creditRating>=7) {
			qualify();
			
				
		}else {
			noQualify();
		}
	}
   public static void qualify() {
	   System.out.println("you are qualified for credit card");
   }
   
   public static void noQualify() {
	   System.out.println("you are not qualified for credit card");
   }
}
