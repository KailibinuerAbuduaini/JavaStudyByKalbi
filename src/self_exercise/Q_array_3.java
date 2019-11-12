package self_exercise;

public class Q_array_3 {

	public static void main(String[] args) {
		int[]x= {1};
		int[]y= {2,8,5};
		System.out.println(A(x,y));

	}
public static String A(int[]a,int[]b) {
	if(!(a.length>1)) {
		return"Array1 is ivalid";
	}else if(!(b.length>1)) {
		return"Array2 is invalid";
	}
		if(a[0]==b[0]||a[a.length-1]==b[b.length-1]) {
			return "true";
		}else {
			return "false";
		}
	
}
}
