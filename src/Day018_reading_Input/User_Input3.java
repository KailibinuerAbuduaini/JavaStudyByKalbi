package Day018_reading_Input;

import java.util.Scanner;

public class User_Input3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter first number:");
       int num1=sc.nextInt();
       
       System.out.println("enter second number:");
       int num2=sc.nextInt();
       
       sc.nextLine();
       
       System.out.println("enter a string:");
       String str=sc.nextLine();
       System.out.println("output:"+num1+":"+num2+":"+str);
 
	}

}
