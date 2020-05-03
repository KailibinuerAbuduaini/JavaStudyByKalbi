package Repl_Assignment_part_6;

public class repl_160_Methodswithreturn_hamlet_logic {

	public static void main(String[] args) {
		
		
		System.out.println(hamletQuote(true, false) );
	}
	public static boolean hamletQuote(boolean toBe,boolean notToBe)
	  {
		
		
		if(toBe||notToBe||(toBe&&notToBe)) {
		return true;
	      
		}
		
		return false;
	
}
}