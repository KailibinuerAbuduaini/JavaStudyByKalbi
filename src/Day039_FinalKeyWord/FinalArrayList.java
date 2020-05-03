package Day039_FinalKeyWord;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		final ArrayList<String> Colors=new ArrayList<>();
		Colors.add("orange");
		Colors.add("red");
		Colors.add("blue");
		
		Colors=new ArrayList<String>();// becuase we add final
		Colors.add("yellow");
	}

}
