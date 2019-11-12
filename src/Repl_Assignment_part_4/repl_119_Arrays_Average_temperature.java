package Repl_Assignment_part_4;

import java.util.Scanner;

public class repl_119_Arrays_Average_temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
		
		
		for(int i=0;i<temps.length;i++) {
		 total=total+temps[i];
		 avgTemp=total/8;
			
		}
		
		System.out.println(avgTemp);
	}

}
