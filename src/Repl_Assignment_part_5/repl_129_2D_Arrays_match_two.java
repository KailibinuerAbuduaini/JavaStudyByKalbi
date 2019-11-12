package Repl_Assignment_part_5;

import java.util.Scanner;

public class repl_129_2D_Arrays_match_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    int[][] arr = new int[rows][cols];
		    for(int i=0 ;i<=rows-1;i++){
		      for(int j=0 ;j<=cols-1;j++){
		        arr[i][j]=inp.nextInt();
		      }//end for cols
		    }//end for rwos
		    
		    //your code here
		    
		    
		    int matches = 0;
		    for(int i=0;i<=rows-1;i++) {
		    	for(int j=0;j<=cols-2;j++) {
		    
			if(arr[i][j]==arr[i][j+1]) {
				matches++;
			}
				
				
    
		   
	}
		    	
		    
}
		    System.out.print("matches: "+matches);
}
}