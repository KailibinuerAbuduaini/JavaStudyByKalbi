package Repl_Assignment_part_4;

import java.util.Arrays;
import java.util.Scanner;

public class repl_123_Arrays_convert_decimal_to_binary {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int decimal = input.nextInt();
		    int[] binary = new int[8];
		    
		    //TODO: Write your code below.
          
           for(int i=0;i<binary.length;i++) {
        	  binary[i]=decimal%2;
        	  decimal=decimal/2;
           }
           System.out.println(Arrays.toString(binary));
           int []newArr=new int [8];
           int index=0;
           for(int j=7;j>=0;j--) {
        	   newArr[index++]=binary[j];
           }
           
           System.out.println(Arrays.toString(newArr));
	}

}
