package Repl_Assignment_part_6;

public class repl_162_Methods_return_locks {

	public static void main(String[] args) {
	/*
	 * This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

  It returns true only if both a and b are true or c is true.
	 */
	}
 public boolean threeLocks(boolean a, boolean b, boolean c) {
    if(a==true&&b==true||c==false) {
    return true;
    }else if (a==true||b==false&&c==true) {
    	return true;
    }else if (a==false&&b==true&&c==true) {
    	return true;
    }else if (a==false&&b==false&&c==false) {
    	return false;
    }else if (a==false&&b==false&&c==true) {
    	return false;
    }else if (a==false&&b==true&&c==false) {
    	return false;
    }
    
    
    	return false;
  }//end
}
