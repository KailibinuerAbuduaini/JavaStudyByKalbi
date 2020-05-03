package Repl_Assignment_part_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class repl_181_Methods_ArrayList_combine_arrays {

	public static void main(String[] args) {
		/*
		combine two String arrays into one arraylist and return it as a string.
		for example:
		combineRs(["f","o","o"],[" b","a","r"])
		returns "foo bar"
		combineRs(["1","2","3"],[" 4"])
		returns "1234"
		 */
		
		String[] a={"f","o","o"};
		String[] b={" b","a","r"};
		System.out.println(combineRs(a,b));

	}
	public static String combineRs(String[] r1,String[] r2) 
	  {
		String result = "";
		for (String each : r1) {
			result = result + each;
		}

		for (String each : r2) {
			result = result + each;
		}

		return result;
	
	   
	  }
}
