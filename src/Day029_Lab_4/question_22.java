package Day029_Lab_4;

public class question_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]x= {1,4,1,4};
System.out.println(num(x));
	}
public static boolean num(int[]a) {
	boolean flag=true;
	int count1=0;
	int count2=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==1) {
			count1++;
		}else if(a[i]==4) {
			count2++;
		}
		if(count1>count2) {
			flag=true;
		}else if(count1==count2) {
			flag=false;
		}
	}
	return flag;
}
}
