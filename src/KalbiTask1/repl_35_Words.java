package KalbiTask1;

import java.util.Scanner;

public class repl_35_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter word1 and word2:");
	    String word1 = s.next();
	    String word2 = s.next();
	    
	    if ((word1.equals(word2))) {
	    	System.out.println("word1 equals word2");
	    }else {
	    	System.out.println("word1 Not equals word2");
	    }
	}

}

//in this assignment you are given two string variables word1 and word2.
//you need to check if they are equal using an if. 
//
//Comparison should be case sensitive. "java" and "JaVa" are not equal.
//
//if they are equal output  "word1 equals word2"
//else output "word1 does not equal word2"