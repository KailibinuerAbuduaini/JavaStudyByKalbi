package Day014_Method;

public class Task_62 {

	public static void main(String[] args) {
		//Write a method that accepts 3 numbers and displays the greatest one in the console.
		calculateGreatest(7, 8, 9);
	}

	public static void calculateGreatest(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1+" is greatest");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2+" is greatest");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println(n3+" is greatest");
		}
	}

}
