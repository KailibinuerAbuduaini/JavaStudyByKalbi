package Day031_ArrayList;

import java.util.ArrayList;

public class ArrayList_example {

	public static void main(String[] args) {
		// languages
		ArrayList<String> Language=new ArrayList<>();
		Language.add("Uyghur");
		Language.add("English");
		Language.add("Italian");
		Language.add("Russian");
		System.out.println(Language.size());
		System.out.println(Language.get(0));
		System.out.println(Language.toString());
		
		
		Language.add("Turkish");
		System.out.println(Language.toString());
		System.out.println(Language.size());
		Language.remove(2);
		System.out.println(Language.toString());
		System.out.println(Language.size());
	}

}
