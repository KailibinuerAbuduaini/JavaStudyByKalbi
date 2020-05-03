package Day014_Method;

public class Task_64 {

	public static void main(String[] args) {
		
		printPattern(6);
	}

	public static void printPattern(int x) {
		for (int i = 1; i <= x; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
