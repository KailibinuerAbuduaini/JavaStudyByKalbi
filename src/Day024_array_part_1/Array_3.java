package Day024_array_part_1;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]myList= {1,2,3,4,5};
		for(int i=0;i<myList.length;i++) {
			System.out.println(myList[i]);
		}
		
		int[] scores= {84,75,82,90};
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum=sum+scores[i];
		}
		int average=sum/scores.length;
		System.out.println(average);
	}

}
