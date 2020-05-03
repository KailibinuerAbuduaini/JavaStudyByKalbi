package self_exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Removesomevalues_4 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        list.removeIf(p -> p>100);
        
        
        //The removeIf() method of ArrayList is used to remove all of the elements of this ArrayList that satisfies a 
        //given predicate filter which is passed as a parameter to the method.
        
        //This method returns True

        System.out.println(list);

	}

}
