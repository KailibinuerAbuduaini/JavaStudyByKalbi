package Repl_Assignment_part_5;

import java.util.Arrays;

public class repl_131_2D_Arrays_DeclareandCreate {
	//Declare and create a two-dimensional array of ints called values, with 2 rows, and initialize 
	//the first row to 8, 20, 50 and the second row to 12, 30, 75.

	public static void main(String[] args) {
		int[][] values=new int[2][3];
		
		values[0][0]=8;
		values[0][1]=20;
		values[0][2]=50;
		
		values[1][0]=12;
		values[1][1]=30;
		values[1][2]=75;
		
		 System.out.println(Arrays.deepToString(values));

	}

}
