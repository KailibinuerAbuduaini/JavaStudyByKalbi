package Repl_Assignment_part_6;

public class repl_172_Methods_String_at_3rd_char {

	public static void main(String[] args) {
		
System.out.println(at3("longword","foo"));
	}
	public static String at3(String target,String word)
	  {
		String result="";
	    for(int i=0;i<target.length();i++) {
	    	result=target.substring(0, 3)+word+target.substring(3);
	    }
	    return result;
	  }
}
