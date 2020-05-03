package Repl_Assignment_part_5;

import java.util.Scanner;

public class repl_145_Methods7_plus_minus {
	//Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , 
	//positive and zero numbers are in the array.

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++)
		    {

		        arr[i]=inp.nextInt();
		    }
		    
		    plus_minus(arr);
		  }

	public static int[] plus_minus(int[] arr) {
		
		int positive=0;
		int negative=0;
		int zero=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positive++;
				
			}else if(arr[i]<0) {
				negative++;
				
			}else if(arr[i]==0) {
				zero++;
			}
		}
		
		System.out.println("positive:"+positive+", "+"negative: "+negative+","+" zero:"+zero);
		return arr;
		
		
	}

	
	
	}


