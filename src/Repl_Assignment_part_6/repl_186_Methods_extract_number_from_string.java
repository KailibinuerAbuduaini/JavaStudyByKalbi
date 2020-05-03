package Repl_Assignment_part_6;

public class repl_186_Methods_extract_number_from_string {

	public static void main(String[] args) {
	System.out.println(extractNum("safdsa324543fdsgxcz"));

	}
	public static String extractNum(String s) {
		char[] arr=s.toCharArray();
		String result="";
		for(int i=0;i<arr.length;i++) {
			if(Character.isDigit(arr[i])) {
				result=result+arr[i];
				
			}
		}
		return result;
}
}