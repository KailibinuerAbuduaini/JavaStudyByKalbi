package self_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class ArrayList_Removesomevalues_2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        Iterator<Integer> it = list.iterator();
// Collection Framework which defines several classes and interfaces
   //to represent a group of objects as a single unit.
        while(it.hasNext()) {

            if(it.next()>100) {

                  it.remove();

            }  
            }

        System.out.println(list);

	

}
}