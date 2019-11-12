package Day008_controlFlowStatements_Part2;

public class Day8If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 5;
		if (day == 1) {
			System.out.println("monday");

		} else if (day == 2) {
			System.out.println("tuesday");

		} else if (day == 5) {
			System.out.println("friday");

		} else {
			System.out.println("no valid day");
		}
//
		int age = 6;
		if (age < 2 || age > 18) {
			System.out.println("ineligible");
		} else if (age == 6 || age == 7) {
			System.out.println("young reader");
		} else if (age >= 8 && age <= 10) {
			System.out.println("middle");
		} else if (age == 13) {
			System.out.println("impossible");
		} else if (age >= 14 && age <= 16) {
			System.out.println("high school");
		} else if (age == 17 || age == 18) {
			System.out.println("scholar");
		}
		int num1, num2, num3;
		num1 = 77;
		num2 = 89;
		num3 = 100;
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1," + num1 + "is biggest");
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("num2," + num2 + "is biggest");
		}
		if (num3 > num1 && num3 > num1) {
			System.out.println("num3," + num3 + "is biggest");
		} else {
			System.out.println("numbers are euqal");
		}
		
		int mark =95;
		if (mark < 60) {
			System.out.println("faild");
		} else if (mark >= 60&&mark<90) {
			System.out.println("pass");
		} else if (mark >= 90) {
			System.out.println("passed with Distiction");
		}
		int sub1=85;
		int sub2=75;
		int sub3=95;
		int average=(sub1+sub2+sub3)/3;
		if(average>60&&average<=59) {System.out.println("F");}
	 else if(average>60&&average<=69){System.out.println("D");
		}else if(average>70&&average<=79) {System.out.println("C");
		}else if(average>80&&average<=89) {System.out.println("B");
		}else if(average>90&&average<=100) {System.out.println("A");
}
	}
}
