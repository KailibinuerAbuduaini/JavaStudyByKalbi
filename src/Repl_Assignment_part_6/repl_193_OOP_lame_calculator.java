package Repl_Assignment_part_6;
class LameCalculator {

	public static int plus(int n1,int n2){
		int n3=n1+n2;
		return n3;
	} 
	
	public static int minus(int n1,int n2){
		int n3;
		if(n1>n2) {
			n3=n1-n2;
		}else if(n2>n1) {
			n3=n2-n1;
		}else {
			return 0;
		}
		
		return n3;
	} 
	public static int  multiply(int n1,int n2){
		int n3=n1*n2;
		return n3;
	} 
	public static int  divide(int n1,int n2){
		int n3=n1/n2;
		return n3;
	} 
	
	
	
	}

public class repl_193_OOP_lame_calculator {
	


	public static void main(String[] args) {
		

	}

	
}
