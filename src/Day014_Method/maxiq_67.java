package Day014_Method;

public class maxiq_67 {

	public static void main(String[] args) {
	
		if( sameDigit(17,27)) {
			System.out.println("same");
		}else{
			System.out.println("no same");
		}
		 
		 
	}
public static boolean sameDigit(int n1,int n2) {
	if((n1%10)==(n2%10)) {
		return true;
	}else {
		return false;
	}
}
}
