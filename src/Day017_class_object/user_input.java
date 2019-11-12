package Day017_class_object;

import java.util.Scanner;


public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a byte value:");
     byte b1=sc.nextByte();
     System.out.println(b1);
     System.out.println(b1*4);
     System.out.println(b1*3);
      System.out.println("enter short value is :");
      short s1=sc.nextShort();
      System.out.println(" short value is :"+s1);
      
      System.out.println("enter a int value  :");
      int i1=sc.nextInt();
      System.out.println(" int value is:"+i1);
      
      System.out.print("Enter a long value:");
		long l1=sc.nextLong();
		System.out.println("Long value is " + l1);
		
		System.out.print("Enter a double value:");
		double d1=sc.nextDouble();
		System.out.println("Double value is " + d1);
		
		System.out.print("Enter a boolean value:");
		boolean bool=sc.nextBoolean();
		System.out.println("Boolean value is " + bool);
	}

}
