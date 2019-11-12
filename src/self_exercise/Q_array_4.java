package self_exercise;

public class Q_array_4 {

	public static void main(String[] args) {
		int[]x= {2,5,6,7};
		System.out.println(Sum(x));

	}
public static int Sum(int[]a) {
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	return sum;
}
}
