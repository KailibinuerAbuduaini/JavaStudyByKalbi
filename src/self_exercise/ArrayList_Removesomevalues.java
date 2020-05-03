package self_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class ArrayList_Removesomevalues {

	public static void main(String[] args) {
		/*
		create two array list,  one Arraylist1 i will add  values which i want to make change
		another Arraylist2 it will be  empty , i will use for each loop inside the loop,we can  put condition find the element smaller than 100 ,
		then add those element to my empty Arraylist2   assigned to the first Arraylist1 
		*/
		// Arrays.asList()---it will convert promitive data type to Array
		// solution 1
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

		ArrayList<Integer> list2 = new ArrayList<>();


			for(int  each : list1) {

		    if( each < 100) {

		    list2.add(each);

		    

		    list1=list2;     
		    }
		 

		    
			}  
			   System.out.println(list1);
	}
	


}
