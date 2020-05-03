package Repl_Assignment_part_6;

import java.util.Arrays;

public class repl_156_Methodswithreturn_1 {

	public static void main(String[] args) {
   String[] some_array = {"a","foo","bar","foo","bla"};
  String some_string="foo";
		System.out.println((count_appearance(some_array,some_string)));
		
	}
	public static int  count_appearance(String[] arr,String t)
	  {
	int	count=0;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i].equalsIgnoreCase(t)) {
			   count++;
		   }
		
	   }
	return count;
		
		
	  } //end  count_appearance
}
