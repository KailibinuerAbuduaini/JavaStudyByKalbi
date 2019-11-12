package Day008_controlFlowStatements_Part2;

public class day8SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String weather="sunny";
		
		switch(weather) {
		
		case "sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go to swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any oyhrt weather");

	}
		String calculater="+";
		
		switch(calculater) {
		case"+":
			System.out.println("add");
			break;
		case"/":
			System.out.println("devide");
			break;
		case"*":
			System.out.println("multiply");
			break;
		default:
			System.out.println("do nothing");
		}
		
		
		int num1=100;
		int num2=5;
		String operator="/";
		int result=0;
		switch(operator) {
		case"+":
			result=num1+num2;
			break;
		case"*":
			result=num1*num2;
			break;
		case"-":
			result=num1-num2;
			break;
		case"/":
			result=num1/num2;
			break;
			default:
			System.out.println("Invalid operator");
		}
		System.out.println("Result is " + result);
	
		
		int num3=10;
		int num4=5;
		String operator1="*";
		int result1=0;
		
		switch(operator) {
		
		case "+":
			result = num3+num4;
			break;
		case "-":
			result = num3-num4;
			break;
		case "*":
			result = num3*num4;
			break;
		case "/":
			result = num3/num4;
			break;
		default:
			System.out.println("Invalid Operator");
		
		}
		
		System.out.println("Result is " + result);
	}
}
