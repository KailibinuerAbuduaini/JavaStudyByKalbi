package self_exercise;

import java.util.Arrays;

public class String_Sameletters123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(same("abs","abc"));

	}
	public static boolean same(String a, String b) {
		
		

		char[] ch1 = a.toCharArray(); // toCharArray will convert string vlue to Array

		char[]  ch2 = b.toCharArray();//

		Arrays.sort(ch1);

		Arrays.sort(ch2);  //static void sort(char[] a) 

		String a1="", a2="";

		for(char each: ch1)

		a1 +=each;

		 

		for(char each: ch2)

		a2 +=each;

		 

		return  a1.equals(a2) ;

		}
}
