package KalbiTask1;

import java.util.Scanner;

public class assighnment_user_input_task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
   System.out.println("enter num:");
   int user_input=sc.nextInt();
         int sum=0;
         
        
   int num=1; 
   while(num<user_input) {
	   sum=sum+num;
 	 
 	  num++;	    
   }
   System.out.println("Total is:" + sum);
	}
}
	