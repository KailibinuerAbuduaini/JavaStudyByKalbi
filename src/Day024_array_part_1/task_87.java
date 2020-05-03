package Day024_array_part_1;

import java.util.Scanner;

public class task_87 {

	public static void main(String[] args) {
	
		 Scanner SC=new Scanner(System.in);
		String[] days=new String[7];
		days[0]="Mon";
		days[1]="Tues";
		days[2]="Wend";
		days[3]="Thurs";
		days[4]="Fri";
		days[5]="SAT";
		days[6]="Sun";
		
		System.out.println("user ender index of days:");
		int index=SC.nextInt();
		System.out.println("today is "+days[index]);
	}

}
