package Repl_Assignment_part_4;

import java.util.Arrays;
import java.util.Scanner;

public class repl_121_Arrays_Printshortest_word_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 
		 
	// olive, fish, pursuit, old, warning, python, java, coffee, cat, ray	 
		 String str = scan.nextLine();
		    
		    String[] str1=str.split(", ");
		    
		    System.out.println(Arrays.toString(str1)); 
		    
		    
		    int shortest=str1[0].length();
		    for(int i=0;i<str1.length;i++) {
		    	if(str1[i].length()<shortest) {
		    		shortest=str1[i].length();
		    	}
		    }
		    
		    System.out.println( shortest);
		    
		   
		    		int count=0;//
		    for(int j=0;j<str1.length;j++) {
		    	if(str1[j].length()==shortest) {
		    		count++;
		    	}
		    }
		    
		    
		    String[] newArr=new String[count];
		    int index=0;// index for array
		    for(int n=0;n<str1.length;n++) {
		    	if(str1[n].length()==shortest) {
		    		newArr[index++]=str1[n];
		    	}
		    }
		    Arrays.sort(newArr); 
		    System.out.println( Arrays.toString(newArr));
	}

}
