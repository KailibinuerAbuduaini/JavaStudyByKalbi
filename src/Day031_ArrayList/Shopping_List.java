package Day031_ArrayList;

import java.util.ArrayList;

public class Shopping_List {

	public static void main(String[] args) {
		ArrayList<String> Shopping_List = new ArrayList<>();
		Shopping_List.add("paper towel");
		Shopping_List.add("dish soap");
		Shopping_List.add("trash bag");
		Shopping_List.add("gloves");
		Shopping_List.add("shovel");
		
		
		System.out.println(Shopping_List.size());
		
        System.out.println(Shopping_List.toString());
        System.out.println(Shopping_List.get(0)+","+Shopping_List.get(Shopping_List.size()-1));
        Shopping_List.remove("paper towel");
        Shopping_List.remove("shovel");
        System.out.println(Shopping_List.toString());
        System.out.println(Shopping_List.toString());
        
        
      //print each item
      		for(String item : shoppingList) {
      			System.out.println(item);
      		}
      		
      		//remove all items at once
      		shoppingList.clear();
      		System.out.println(shoppingList.toString());
   




      
        
	}

}
