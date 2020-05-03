package Repl_Assignment_part_6;

import java.util.Scanner;

public class repl_153_Methods_Printuniquewords {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    String[] words = new String[size];
		    for(int i=0; i < size; i++){
		      words[i] = scan.next();
		    }
		    printUniqueWords(words);
		  }
		  
		  public static void printUniqueWords(String[] words){
		    //WRITE YOUR CODE HERE
		    String unique="";
			  
			  for(int i=0;i<words.length;i++) {
				  int count=0;
				  for(int j=0;j<words.length;j++) {
					  if(words[i].equals(words[j])){
						  count++;
					  }
					  
				  }
				  
				  if(count==1) {
					  unique=words[i];
					  System.out.println(unique);
				  }
			  }
		    
		  }
		

	}
//java, code, python, code, rust, code, rust

