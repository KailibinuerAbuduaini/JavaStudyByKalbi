package Repl_Assignment_part_6;

import java.util.ArrayList;
import java.util.Arrays;

public class repl_199_Methods_ArrayList_repeatAll {

	public static void main(String[] args) {
		
		
			ArrayList<Boolean> booleans = new ArrayList<>(Arrays.asList(true, false, false));

			repeatAL(booleans);

	}

	public static void repeatAL(ArrayList<Boolean> a) {
		int newSize=a.size();
		for(int i=0;i<newSize;i++) {
			a.add(a.get(i));
			


		}
		System.out.println(a.toString());
	}
}
