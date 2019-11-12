package Day027_two_dimentional_array;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]x= {1,2,6};
		acceptArray(x);
	}
public static int[] acceptArray(int[] array) {
	
	for(int i=0;i<array.length;i++) {
		if(array[i]==6) {
			System.out.println(true);
		}
	}
	return array;
}
}
