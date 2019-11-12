package Day030_wrapper_class;

public class varArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum(2,4);
sum(2,3,4,5,6,76);

concat("apple","orange","123","result");
	}

	public static void sum(int...numbers) {
	int sum=0;
	for(int value:numbers) {
		sum=sum+value;
		System.out.println(sum);{//A variable_arguments
	}
	}
	
	
	}
	public static void concat(String...strs) {
		String newStr="";
		for(String str:strs) {
			newStr=newStr+str.charAt(2);
		}
		System.out.println(newStr);
		// return newStr
	}
}

