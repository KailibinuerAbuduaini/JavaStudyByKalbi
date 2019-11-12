package Day008_controlFlowStatements_Part2;

public class smallTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String computer = "Apple";

		switch (computer) {
		case "Apple":
			System.out.println("No virus");
			break;
		case "DELL":
			System.out.println("TOUGH");
			break;
		case "Acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("Do not buy");

		}

		String day = "4";
		switch (day) {
		case "1":
			System.out.println("1-Monday");
			break;
		case "2":
			System.out.println("2-Tuesday");
			break;
		case "3":
			System.out.println("3-Wensday");
			break;
		case "4":
			System.out.println("4-Thursday");
			break;
		case "5":
			System.out.println("5-Friday");
			break;
		case "6":
			System.out.println("6-Saturdaay");
			break;
		default:
			System.out.println("No Exit!");
		}

		// ORE LOGIC
		char grade = 'A';
		// A,B or C -> Pass D or E
		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("pass");
			break;

		case 'D':
			System.out.println("fail");
			break;
		}

		char color = 'R';
		switch (color) {
		case 'O':
		case 'o':
		case 'R':
		case 'r':
			System.out.println("stay");
			break;
		case 'G':
		case 'g':
			System.out.println("pass");
			break;

		}
	}

}
