package Day013_Method;

public class Task_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator(6,7,"+");
	}
public static void Calculator(int x,int y,String operators) {
	switch (operators) {
	case"*":
		System.out.println(x*y);
		break;
	case"-":
		System.out.println(x-y);
		break;
	case"/":
		System.out.println(x/y);
		break;
	case"+":
		System.out.println(x+y);
		break;
	}
	
}
}
