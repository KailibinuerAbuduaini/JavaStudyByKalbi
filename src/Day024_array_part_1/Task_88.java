package Day024_array_part_1;

import java.util.Random;
import java.util.Scanner;

public class Task_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		int price=0;
		String[]cars=new String[7];
		
		cars[0]="HONDA";
		cars[1]="TOYOTA";
		cars[3]="NISSAN";
	
		
		System.out.println("ENTER YOUR DREAM CAR:");
		int index=sc.nextInt();
		System.out.println("YOUR CAR:"+cars[index]);
		
		
		if(cars[index]=="HONDA"||cars[index]=="TOYOTA") {
		price=rn.nextInt((40000-20000)+1)+20000;
		System.out.println("price:"+price);
		}
	}

}
