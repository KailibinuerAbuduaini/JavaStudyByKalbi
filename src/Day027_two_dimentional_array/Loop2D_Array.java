package Day027_two_dimentional_array;

public class Loop2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int [][] numbers= {{1,2,3},{4,5},{7,8,9}};
for(int row=0;row<numbers.length;row++) {
	for(int column=0;column<numbers[row].length;column++){
		System.out.println(numbers[row][column]);
	}
}
	

	
	}
}


