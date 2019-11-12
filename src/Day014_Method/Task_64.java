package Day014_Method;

public class Task_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}

	public static void printPattern(int x) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
