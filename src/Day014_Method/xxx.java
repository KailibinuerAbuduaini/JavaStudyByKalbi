package Day014_Method;

public class xxx {

	public static void main(String[] args) {
		//

		cigarParty(64,true);
	}
	public static void cigarParty(int num1,boolean n) {
		if (num1>=40&&num1>=60&&n==true) {

		System.out.println("party is great!");
		}else if(num1<40&&n==false) {

		System.out.println("party is not great!");
		}
	}
}
