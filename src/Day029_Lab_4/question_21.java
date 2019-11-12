package Day029_Lab_4;

public class question_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]x= {1,2,3,4,2,5,2,6};
System.out.println(sumTwo(x));
	}
public static boolean sumTwo(int[]a) {
	int sum=0;
	boolean flag=true;
	for(int i=0;i<a.length;i++) {
		if(a[i]==2&&sum+a[i]==8) {
			flag=true;
		}else if(a[i]==2&&sum+a[i]!=8)	{
			
		}
	
}
	return flag;
}
}// qayta exlang