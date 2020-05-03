package self_exercise;

public class Array1 {

	public static void main(String[] args) {
		

		int[]a= {1,2,5,2,6,6};
		int i;
	
		for( i=0;i<a.length;i++) {

	for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				
				System.out.println(a[j]);
		}
	}
	
	}
		
	
	
		
	}
}
