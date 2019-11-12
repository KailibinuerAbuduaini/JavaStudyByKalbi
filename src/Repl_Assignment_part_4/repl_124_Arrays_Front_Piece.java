package Repl_Assignment_part_4;

import java.util.Arrays;
import java.util.Scanner;

public class repl_124_Arrays_Front_Piece {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			int[] num = new int[size];
			for(int i =0; i < size; i++) {
				num[i] = scan.nextInt();
			}
			//WRITE YOUR CODE HERE
   int[] newArr=null;
   if(size>=2) {
	   newArr=new int[2];
   newArr[0]=num[0];
   newArr[1]=num[1];
   }
   else if(size==1) {
	   newArr=new int[1];//array size
	   newArr[0]=num[0];  
   }
   System.out.println(Arrays.toString(newArr));
			
			
	}

}
