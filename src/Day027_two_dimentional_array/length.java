package Day027_two_dimentional_array;

public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = { { 1, 2, 3 }, 
				{ 5, 6 },
				{ 9, 10, 11, 23, 30, 50, 60 } };
// display the numbers rows
		System.out.println(numbers.length);
// display the number of colums in the row
		for (int i = 0; i < numbers.length; i++) {
			for(int j=0;j<numbers[i].length;j++)
			//System.out.println("the number of colums in row" + i + "is" + numbers[i].length);
			System.out.println(numbers[i][j]);
		}
		
	}

}
