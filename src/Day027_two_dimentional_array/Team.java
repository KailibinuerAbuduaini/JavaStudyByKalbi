package Day027_two_dimentional_array;

public class Team {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
String[][] teams=new String[2][4];
teams[0][0]="mike";
teams[0][1]="smith";
teams[0][2]="evan";
teams[0][3]="Dawid";

teams[1][0]="ross";
teams[1][1]="emmy";
teams[1][2]="john";
teams[1][3]="ryan";
*/
		
String [][] teams= {{"mike","smith","evan","david"},{"ross","john","ryhan"}};
System.out.println("first playes of first team");
System.out.println(teams[0][0]);
System.out.println("number of rows"+teams.length);
System.out.println("people in the first team "+teams[0].length);
System.out.println("people in the second team "+teams[0].length);


	}

}
