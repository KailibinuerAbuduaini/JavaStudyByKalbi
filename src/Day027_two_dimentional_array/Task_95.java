package Day027_two_dimentional_array;

public class Task_95 {

	public static void main(String[] args) {
		
		int sum=0;
		int[][]students={ {68,75,54,80},
				          {100,64,20,50},
				          {10,35,40,90}};
		for(int i=0;i<students[0].length;i++) {
			
			//	System.out.println(students[0][i]);
				//sum=sum+i;
				sum=sum+students[0][i];
			}
			
		System.out.println(sum/students[0].length);
		
	int sum2=0;
			for(int j=0;j<students.length;j++) {
				sum2=sum2+students[j][0];
	}
System.out.println(sum2);
}
}