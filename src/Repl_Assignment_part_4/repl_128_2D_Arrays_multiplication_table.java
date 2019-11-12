package Repl_Assignment_part_4;

import java.util.Arrays;

public class repl_128_2D_Arrays_multiplication_table {

	public static void main(String[] args) {
		int [][] multiplicationTable = new int[10][10];
		
		for(int i=0;i<multiplicationTable.length;i++) {
			for(int j=0;j<multiplicationTable[i].length;j++) {
				multiplicationTable[i][j]=(i+1)*(j+1);
		}

	}
		
		System.out.println(Arrays.deepToString(multiplicationTable) );
	}
}
