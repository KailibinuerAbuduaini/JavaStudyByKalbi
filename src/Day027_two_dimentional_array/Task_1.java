package Day027_two_dimentional_array;

public class Task_1 {

	public static void main(String[] args) {
		
		
		int [][] newNum= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{0}
				
				
		};
  for(int i=0;i<newNum.length;i++) {
	  for(int j=0;j<newNum[i].length;j++) {
		  System.out.print(newNum[i][j]);
		  
	  }
	  System.out.println("");
  }
	 
	}

}
