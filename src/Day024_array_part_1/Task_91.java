package Day024_array_part_1;

import java.util.Random;

public class Task_91 {

	public static void main(String[] args) {
	

		
		Random rn=new Random();
		int n1=rn.nextInt(100);
		int[]elements= new int[10];
	
		for(int i=0;i<elements.length;i++) {
			elements[i]=rn.nextInt(100);
			System.out.println(	elements[i]);
		}
		
		
		
	}

}
