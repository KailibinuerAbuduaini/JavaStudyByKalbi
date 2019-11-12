package Repl_Assignment_part_5;

import java.util.Arrays;

public class repl_134_2D_Arrays_Chessboard {
	/*
	 * Given a 8x8 two-dimensional array of strings named chessboard.
	 *  Initialize values inside an array accordingly to the chess board. 
	 *  So first element in the array, chessboard[0][0] 
	 *  should have a value "1a", and last element in the array, 
	 * chessboard[7][7] should have a value "8h". 
	 */

	public static void main(String[] args) {
		
       String[][] chessBoard=new String[8][8];
       String[] element= {"a","b","c","d","e","f","g","h"};
       for(int i=0;i<8;i++) {
	    for(int j=0;j<8;j++){
		chessBoard[i][j]=(i+1)+element[j];
		
	}
}

System.out.println(Arrays.deepToString(chessBoard));



	}
}


