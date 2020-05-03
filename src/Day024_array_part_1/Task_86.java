package Day024_array_part_1;

import java.util.Scanner;

public class Task_86 {

	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
         
		String[] months=new String[12];
		       months[0] = "january";
		       months[1] = "Feb";
		       months[2] = "March";
		       months[3] = "April";
		       months[4] = "May";
		       months[5] = "jun";
		       months[6] = "july";
		       months[7] = "August";
		       months[8] = "sep";
		       months[9] = "oct";
		       months[10] = "november";
		       months[11] = "Dec";
		       System.out.println("enter your month index number:");
		       int index=sc.nextInt();
		       System.out.println("the month is "+months[index]);
		       
	}

}
