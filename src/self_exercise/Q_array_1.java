package self_exercise;

public class Q_array_1 {

	public static void main(String[] args) {
		
		int x[]= {1,4,3,7,6};
		System.out.println(f(x));
	}
public static boolean  f(int[] a) {
	if(a.length<1) {
		return false;
	}
	else if(a[0]==6||a[a.length-1]==6) {
		return true;
	}else {
		return false;
	}
}
}
