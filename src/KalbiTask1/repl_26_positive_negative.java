package KalbiTask1;

import java.util.Scanner;

public class repl_26_positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
		    int num = s.nextInt();
		    
		    if(num>0) {
		    	System.out.println("positive");
		    }else if(num<0) {
		    	System.out.println("negative");
		    }else if(num==0) {
		    	System.out.println("zero");
		    }  
	}

}
