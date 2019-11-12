package Day028_Lab_4;

import java.util.Arrays;

public class question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]x= {1,2};
		int[]y= {1,2};
		System.out.println(Arrays.toString(checkNum(x,y)));
		
	}
public static int[] checkNum(int[]a,int[]b){
	int sum1=0;
	int sum2=0;
	for(int i=0;i<a.length;i++) {
		sum1=sum1+a[i];
	}
	for(int i=0;i<b.length;i++) {
		sum2=sum2+b[i];
	}
	
	if(sum2>sum1) {
		return b ;
	}else if(sum1==sum2){
	System.out.println("equal");
	}
	
	return a;
}

}
