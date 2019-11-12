package Assaignments;

import java.util.Random;
import java.util.Scanner;

public class assaignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount_of_money;
        int n1,n2,n3,n4;
        String again;    int total_money = 0;
       // Cherries, Oranges, Plums, Bells, Melons, Bars
     
    	do {            
                Scanner sc=new Scanner(System.in);
                
                System.out.println("enter amout of money:");
                amount_of_money=sc.nextInt();
                
                for(int i=0;i<3;i++) {
                Random rn=new Random();  
                n1=rn.nextInt(6);
                n2=rn.nextInt(6);
                n3=rn.nextInt(6);
                
                if (n1==0||n2==0||n3==0) {
             	   System.out.println("Cherries");
                }else if(n1==1||n2==1||n3==1) {
             	   System.out.println("Oranges");
                }else if(n1==2||n2==2||n3==2) {
             	   System.out.println("Plums");
                }else if(n1==3||n2==3||n3==3) {
             	   System.out.println(" Bells");
                }else if(n1==4||n2==4||n3==4) {
             	   System.out.println(" Melons");
                }else if(n1==5||n2==5||n3==5) {
             	   System.out.println(" Bars");

                }
                if(n1==n2||n1==n3) {
             	   total_money=amount_of_money*2;
             	     
                }else if(n1==n2&&n1==n3&&n2==n3) {
             	   total_money=amount_of_money*3;
             	
                }else if (n1!=n2||n1!=n3||n2!=n3){
             	   total_money=amount_of_money*0;
             	 
                }
                
             
                }    
                System.out.println("you want to play again");
                again=sc.next();
              
              
		} while(again.equalsIgnoreCase("yes"));
             	 
         if(again.equalsIgnoreCase("no")) {
         	System.out.println("user entered money: "+amount_of_money);
         	System.out.println("user win: "+total_money);
         	
         }	 
	}

}
