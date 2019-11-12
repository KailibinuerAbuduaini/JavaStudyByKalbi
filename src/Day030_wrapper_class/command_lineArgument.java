package Day030_wrapper_class;

import java.util.Scanner;

public class command_lineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
