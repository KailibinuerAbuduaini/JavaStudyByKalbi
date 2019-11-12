package Repl_Assignment_part_4;

import java.util.Arrays;

public class repl_117_Arrays_Copy_Certain_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
	    int count=0;
	    
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i].contains("e")) {
	    	count++;
	    	}
	    }
	    String[]fewValues=new String[count];
	    
	    int index=0;
	    for(int j=0;j<arr.length;j++) {
	    	if(arr[j].contains("e")) {
	    		fewValues[index++]=arr[j]	;
	    	}
	    }
	
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	}

}
