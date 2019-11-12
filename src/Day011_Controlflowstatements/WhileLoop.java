package Day011_Controlflowstatements;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // int i=0;
       //while(i<=10) {
    	  // System.out.println("student"+i);
    	  // i++;
      // }
       
       int n=25;
       while(n>10) {
    	   System.out.println(n);
    	   n--;
       
	}
       int i=0;
		int sumEven=0;
		
		while(i<100) {
			
			if(i%2==0) {
				
				sumEven = sumEven + i;
			}
			
			i++;
		}
		
		System.out.println(sumEven);
    	   
       }
	}

