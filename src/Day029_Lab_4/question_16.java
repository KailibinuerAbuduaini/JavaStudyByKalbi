package Day029_Lab_4;

public class question_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]x= {1,2,3,4,2};
System.out.println(even(x));
	}
public static int even(int[]a) {
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			count++;
		}
	
	}
	return count;
}
}
