package KalbiTask1;

import java.util.Scanner;

public class repl_25_greater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	    int b = s.nextInt();
	    if(a>b) {
	    	System.out.println(a+" is greater");
	    }else if(b>a) {
	    	System.out.println(b+" is greater");
	    }
	}

}
