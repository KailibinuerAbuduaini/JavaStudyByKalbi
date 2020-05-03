package Repl_Assignment_part_6;

import java.util.Arrays;

public class repl_200_MethodswithArrays_switchelements {

	public static void main(String[] args) {
		int[]x= {1,2,3};
		System.out.println(Arrays.toString(do_switch(x)));
	}
	public static int[] do_switch(int[] i) 
	 {
		int x=i[0];
		for(int j=0;j<i.length-1;j++) {
			
			i[j]=i[j+1];
		
		

		}
		
		i[i.length-1]=x;
		return i;
}
}