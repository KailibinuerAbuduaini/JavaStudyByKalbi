package Day019_String_manipulation;

public class String_charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String word="computer";
    System.out.println(word.length());
    System.out.println(word.indexOf("c"));
    System.out.println(word.charAt(1));
    System.out.println(word.charAt(2));
    System.out.println(word.charAt(3));
    System.out.println(word.charAt(4));
    System.out.println(word.charAt(5));
    System.out.println(word.charAt(6));
    System.out.println(word.charAt(7));
    
   // check if first character A
    String word2="Apple";
    
    if(word2.charAt(0)=='A') {
   System.out.println("first character is A");
	}else {
System.out.println("it is not first character ");
	}
	
     String word3="civic";
    if(word3.charAt(0)==word3.charAt(4)) {
  System.out.println("first and last character are same");
}else {
	System.out.println("not same");
}
    
    //last index not coded
    String word4="Java";
    char lastChar=word4.charAt(word4.length()-1);
    System.out.println("last char of "+word4+" is "+lastChar);
	}
}

