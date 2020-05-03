package self_exercise;

public class RetrunValues {
	
	
	 static int myMethod(int x) {
		    return 5 + x;
		  }
	 
	 static int myMethod(int x, int y) {
		    return x + y;
		  }
	 
	 // Create a checkAge() method with an integer variable called age
	  static void checkAge(int age) {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!");

	    // If age is greater than 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You are old enough!");
	    }

	  }

	public static void main(String[] args) {
		
		System.out.println(myMethod(3));
		 System.out.println(myMethod(5, 3));
		 
		 checkAge(6);
	}

}
