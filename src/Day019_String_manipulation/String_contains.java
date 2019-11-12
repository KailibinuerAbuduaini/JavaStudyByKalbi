package Day019_String_manipulation;

public class String_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String email="test@gmail.com";
  System.out.println(email.contains("@"));
  String list="potato,apples,bananas,orange";
  if(list.contains("orange")) {
	  System.out.println("orange are in your list");
  }else {
	  System.out.println("orange not in the list");
  }
  
  boolean hasEggs=list.contains("eggs");
  System.out.println("contains eggs:"+hasEggs);
	}

}
