package Repl_Assignment_part_5;

import java.util.Arrays;
import java.util.Scanner;

public class repl_137_2D_Arrays_argest_number2 {
	/*
	 * Given a 2d array of ints, find the biggest number(integer) and 
	 * replace all array values on biggest number in the array then print an array.
	 */
	

	public static void main(String[] args) {
	   
		 Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    int[][] arr = new int[rows][cols];
		    for(int i=0 ;i<=rows-1;i++){
		      for(int j=0 ;j<=cols-1;j++){
		        arr[i][j]=inp.nextInt();
		      }//end for cols
		    }//end for rows
		    
		    
		    //TODO write your code below
		    int great=arr[0][0];
		    
		    for(int i=0 ;i<=rows-1;i++){
			      for(int j=0 ;j<=cols-1;j++){
			    if(arr[i+1][j+1]>arr[0][0]) {
			    	great=arr[i+1][j+1];
			    } 
			      }
			    }
		    
		    
		    for(int i=0 ;i<rows-1;i++){
			      for(int j=0 ;j<cols-1;j++){
			    	  arr[i][j]=great;
			      }
			     
		  
		    }
		    
		    
		    //FINAL PRINT
		    System.out.println(Arrays.deepToString(arr));
		    
		   

	}

}
