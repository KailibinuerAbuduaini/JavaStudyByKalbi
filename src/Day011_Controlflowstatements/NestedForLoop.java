package Day011_Controlflowstatements;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i=1;i<=5;i++) {
	//System.out.println("Outer Loop Iteration " + i);
			
		//	for(int j=1;j<=2;j++) {
				
			//	System.out.println("i = " + i + "; j = " + j);

	//	}

	//	}
		//nested for loop2
		for(int i=0;i<3;i++) {
			System.out.println("Outer Loop Iteration " + i);
			for(int p=0;p<=3;p++) {
				System.out.println("inner Loop Iteration " + p);
					if(p==3) {
						System.out.println();
					}
			}
		}
	
	}
	
}


