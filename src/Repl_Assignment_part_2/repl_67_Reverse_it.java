package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_67_Reverse_it {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    if(word.length()==5) {
	    	for(int i=word.length()-1; i>=0;i--) {
	    	System.out.print(word.charAt(i));}
	    }else if(word.length()<5) {
	    	System.out.println("Too short!");
	    }else if(word.length()>5) {
	    	System.out.println("Too long!");
	    }
	}

}
