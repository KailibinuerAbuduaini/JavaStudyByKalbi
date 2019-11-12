package Day029_Lab_4;

public class question_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]x= {1,2,3};
System.out.println(contain(x));
	}
public static boolean contain(int[]a) {
	boolean flag=false;
	for(int i=0;i<a.length;i++) {
		if(a[i]==2&&a[i+1]==2) {
			flag=true;
			break;
		}
}
	
	return flag;
}
}
