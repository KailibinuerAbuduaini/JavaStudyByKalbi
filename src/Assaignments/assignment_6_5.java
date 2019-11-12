package Assaignments;

public class assignment_6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array=10;
		int []fibinaci=new int [array];
		
		fibinaci[0]=0;
		fibinaci[1]=1;
		for(int i=2;i<fibinaci.length;i++) {
			fibinaci[i]=fibinaci[i-1]+fibinaci[i-2];
			
		}
		for(int i=0;i<fibinaci.length;i++) {
			System.out.println(fibinaci[i]);
		}
	}

}
