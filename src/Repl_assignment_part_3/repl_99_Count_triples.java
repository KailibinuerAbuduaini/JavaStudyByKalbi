package Repl_assignment_part_3;

import java.util.Scanner;

public class repl_99_Count_triples {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 String str = scan.next();
		    int count = 0 ;
		    
		    for(int i=0;i<str.length()-2;i++) {
		    	if(str.charAt(i)==str.charAt(i+1)&&str.charAt(i)==str.charAt(i+2)){
		    		count++;
		    	
		    	}
		    }
              System.out.println(count);
	}

}
