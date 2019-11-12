package Day028_Lab_4;

public class Lab_4_question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] x= {2,3,4};
System.out.println(sumElement(x));
	}
	public static int sumElement(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			 sum=sum +arr[i];
		}
		return sum;
	}
	

}
