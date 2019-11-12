package Repl_assignment_part_3;

import java.util.Scanner;

public class repl_95_Get_Sandwich {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	      String between = "";
	      
		 String arr = "";
	     int counter = 0;
	     
	     for(int i=0; i<str.length()-4; i++){
	       
	       if(str.substring(i,i+5).equals("bread")){
	       
	       arr = arr + i + ",";
	       
	       counter++;
	       
	     }
	     
	 }
	     
	     if(counter>1){
	       
	     String[] indexes = arr.split(",");
	    
	     int index1 = Integer.parseInt(indexes[0]);
	     int index2 = Integer.parseInt(indexes[indexes.length-1]);
	     
	     String newStr = str.substring(index1+5,index2); 
	       
	     System.out.println(newStr);
	       
	     }else if(counter<=1){
	       
	       System.out.println("nothing");
	     }
	}
	}


