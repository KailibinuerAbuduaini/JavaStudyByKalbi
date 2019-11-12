package Repl_assignment_part_3;

import java.util.Scanner;

public class repl_88_Print_Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
		    char start = scan.next().charAt(0);
		    char end = scan.next().charAt(0);
		   
		    String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    String lowerCase="abcdefghijklmnopqrstuvwxyz";
		    
		    if(Character.isUpperCase(start)) {
		    	int startp=upperCase.indexOf(start);
		    	int endp=upperCase.indexOf(end);
		    	for(int i=startp;i<=endp;i++) {
		    		System.out.print(upperCase.charAt(i));
		    	}
		    } else if(Character.isLowerCase(start)){
		    	int startp=lowerCase.indexOf(start);
		    	int endp=lowerCase.indexOf(end);
		    	for(int i=startp;i<=endp;i++) {
		    		System.out.print(lowerCase.charAt(i));
		    	}
		    }
		    
	}


}
