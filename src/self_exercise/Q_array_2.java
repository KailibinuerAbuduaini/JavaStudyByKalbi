package self_exercise;

public class Q_array_2 {

	public static void main(String[] args) {
	
		int[] x = {1};
		System.out.println(L(x));
	}

	public static String L(int[] a) {
		
		  if(!(a.length>1)) {
	    	  return "not valid";
	      }

		if (a.length > 1) {
		
			if (a[0] == a[a.length - 1]) {
				return "true";
			}else {
				return "false";
			}
		}
		return null;
    
		

	}
}
