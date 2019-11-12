package Day027_two_dimentional_array;

import java.util.Arrays;

public class Pizza_2D_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] pizzas= {
		{"pinneapple","pepperoni"},
		{"anchovies","mushroom","olives"},
		{"4 cheese"},
		{"chicken","tomatoes","onioons"},
		{"green peppers","zuccini","brocoli","spinach","shrimp"}
};
/*
for(int i=0;i<pizzas.length;i++){
	for(int j=0;j<pizzas[i].length;j++) {
		System.out.println(pizzas[i][j]);
	}
}
*/
for(String[]pizza:pizzas) {
	System.out.println(pizza.length+"_");
	System.out.println(Arrays.toString(pizza));
}
//peste []mavu belge yoq
	for(String  value:pizzas[3]) {
		System.out.println(value);
	}

	int[][]students= {{4,5,6},{12,5,7},{23,56,12,55,3}};
	for(int[]group:students) {
		for(int studentID:group) {
			System.out.println(studentID);
		}
	}
	}
}