package self_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_Removesomevalues_3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        for(Iterator<Integer> il = list.listIterator();il.hasNext();) {

            if(il.next()>100)

                il.remove();

        }

        System.out.println(list);

	}

}
