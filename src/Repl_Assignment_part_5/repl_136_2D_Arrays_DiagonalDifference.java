package Repl_Assignment_part_5;

import java.util.Scanner;

public class repl_136_2D_Arrays_DiagonalDifference {

	public static void main(String[] args) {
	/*
	Given a square matrix, calculate the absolute difference 
	between the sums of its diagonals.
	For example, the square matrix  is shown below:
     1 2 3   The left-to-right diagonal = 1+5+9 = 15.
     4 5 6   The right to left diagonal =  3+5+9 = 17.
     9 8 9   Their absolute difference is |15-17| = 2.


11
7
4
1
5
7
10
1
-12
*/
		 Scanner scan = new Scanner(System.in);
		    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
		                            };
		                            
		    int result = 0;
		   int rightdiagonal=0;
		   int leftdiagonal=0;
		    for(int i=0;i<matrix.length-2;i++) {
		    	for(int j=0;j<matrix.length-2;j++) {
		    		
		    		rightdiagonal=matrix[i][j]+matrix[i+1][j+1]+matrix[i+2][j+2];
		    		leftdiagonal=matrix[i][j+2]+matrix[i+1][j+1]+matrix[i+2][j];
		    		
		    		result=rightdiagonal-leftdiagonal;
		    	}
		    }
		    
		    // FINAL PRINT
		    System.out.println(Math.abs(result));
		
	}

}
