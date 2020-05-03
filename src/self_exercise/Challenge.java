package self_exercise;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/*
 * You are provided a string containing a list of positive integers separated by a space (" "). 
Take each value and calculate the sum of its digits, which we call it's "weight". 
Then return the list in ascending order by weight, as a string joined by a space.
For example 99 will have "weight" 18, 100 will have "weight"
 1 so in the ouput 100 will come before 99.
Example:
"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
 "100
180 90 56 65 74 68 86 99"
When two numbers have the same "weight", let's consider them to be strings and not numbers:
100 is before 180 because its "weight" (1) is less than the one of 180 (9)
 and 180 is before 90 since, having the same "weight" (9) it comes before as a string.
All numbers in the list are positive integers and the list can be empty.
 */

class MyComparator implements Comparator<Object> {
    Map<String,Integer> map;
    public MyComparator(Map<String, Integer> map) {
        this.map = map;
    }
    @Override
    public int compare(Object o1, Object o2) {
        if (map.get(o2) == map.get(o1))
            return 1;
        else
            return ((Integer) map.get(o1)).compareTo((Integer) map.get(o2));
    }
}






public class Challenge {
	 public static Map<String,Integer> weigth(int unsorted[]) {
	        String number="";
	        Map<String, Integer> map = new HashMap<String,Integer>();
	        for (int i = 0; i < unsorted.length - 1; i++) {
	            number = String.valueOf(unsorted[i]);
	            int sum = 0;
	            int deger = unsorted[i];
	            while (deger > 0) {
	                sum = sum + deger % 10;
	                deger = deger / 10;
	            };
	            map.put(number, sum);
	        }
	        MyComparator comparator = new MyComparator(map);
	        Map<String, Integer> newMap = new TreeMap<String, Integer>(comparator);
	        newMap.putAll(map);
	        return newMap;
	    }
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(Brackets.brackets("{{{}][}}"));
        int[] array = {56, 56, 66, 76, 100, 99, 68, 87, 180, 90};
        Map<String, Integer> sorted = new HashMap<>();
        sorted=weigth(array);
        System.out.print(sorted.toString());
    

	}

}
