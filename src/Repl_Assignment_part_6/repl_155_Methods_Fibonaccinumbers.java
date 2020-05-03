package Repl_Assignment_part_6;

import java.util.Scanner;

public class repl_155_Methods_Fibonaccinumbers {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		  }

	public static void fib(int num){
	    //WRITE YOUR CODE HERE
		{ 
			int a=0;
			int b=1;
			int c;
			
		    if (num == 0) {
		       System.out.println(a);
		    }else if(num>0) {
		    	
		    	for(int i=2;i<num;i++) {// we already define index 0 and index 1, so forloop should start with index 2;
		    		c=a+b;
		    		a=b;
		    		b=c	;
		    	}
		    	System.out.println(b); 
		    	}
		    
		    
		    } 
		       
		  
		
	  }

}
