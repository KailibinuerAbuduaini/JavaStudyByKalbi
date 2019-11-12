package Repl_Assignment_part_5;

import java.util.Arrays;

public class repl_132_2D_Arrays_DeclareandCreate2 {
/*
 * Declare and create a two-dimensional array of chars called tictactoe, 
 * with 3 rows, each with 3 elements, 
 * and initialize it to all space characters.

 */

	public static void main(String[] args) {
		char[][] tictactoe=new char[3][3];
		tictactoe[0][0]=' ';
		tictactoe[0][1]=' ';
		tictactoe[0][2]=' ';
		
		tictactoe[1][0]=' ';
		tictactoe[1][1]=' ';
		tictactoe[1][2]=' ';
		
		tictactoe[2][0]=' ';
		tictactoe[2][1]=' ';
		tictactoe[2][2]=' ';
		
		
		
		System.out.println(Arrays.deepToString(tictactoe));
	}

}
