package Repl_Assignment_part_4;

import java.util.Scanner;

public class repl_115_Arrays_Finding_Max_Length {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();
			  
			}
			
			//write your code below
			
		int large=words[0].length();
		int index=0;
			for(int j=0;j<5;j++) {
				if(words[j].length()>large) {
					
					 index=j;
					
				}
			}
			System.out.println(words[index]);
	}

}
