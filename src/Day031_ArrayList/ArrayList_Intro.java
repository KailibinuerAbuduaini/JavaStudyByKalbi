package Day031_ArrayList;

import java.util.ArrayList;

public class ArrayList_Intro {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		ArrayList<Integer> nums=new ArrayList<>();
		
		names.add("make");
		names.add("kelly");
		names.add("guzal");
		names.add("kamar");
		
       nums.add(99);
       nums.add(1000);
       nums.add(990);
       nums.add(new Integer("100"));
       System.out.println(names.get(0));
       System.out.println(names.get(2));
       System.out.println(names.get(3));
       System.out.println(names.size());
       System.out.println(nums.size());
       
       System.out.println(names.toString());

	}

}
