package Repl_Assignment_part_2;

import java.util.Scanner;

public class repl_64_Middle_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    if(word.length()%2==1) {
	    	if(word.length()>=3) {
	    	int mid=word.length()/2;
	    	System.out.println(word.substring(mid,mid+1));
	    }else if(word.length()==1) {
	    	System.out.println(word+word+word);
	    }
	    	}
	    
	    
	    
	    else if(word.length()>=4) {
	    	if(word.length()%2==0) {
	    		int mid=word.length()/2;
	    		System.out.println(word.substring(mid-1,mid+1));
	    	}
	    	
	    }else if(word.length()==2) {
	    	System.out.println(word+word);
	    }
	    
	}
	}