package KalbiTask1;

import java.util.Scanner;

public class display_the_percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter male number:");
         double male=sc.nextInt();
         System.out.println("enter female number:");
         double female=sc.nextInt();
         double  display_the_percentage=((male/(male+female))*100);
        System.out.println("display_the_percentage:" +display_the_percentage+"%");

	}

}
