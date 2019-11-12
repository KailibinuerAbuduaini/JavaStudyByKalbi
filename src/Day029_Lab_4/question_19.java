package Day029_Lab_4;

public class question_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]x= {1,2,3,5,6,7};
System.out.println(total(x));
	}
public static int total(int[]a) {
	int total=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==6) {
			break;
		}else {
			total=total+a[i];
		}
	}
	return total;
	
	// bu hata malimdin ugining
}
}
