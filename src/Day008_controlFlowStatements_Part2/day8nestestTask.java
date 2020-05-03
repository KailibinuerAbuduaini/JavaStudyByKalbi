package Day008_controlFlowStatements_Part2;

public class day8nestestTask {

	public static void main(String[] args) {

		int n1 = 1000;
		int n2 = 1000;
		int n3 = 100;
		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is big");
		} else {
			if (n2 > n3) {
				System.out.println("n2 is bigger");
			} else {
				System.out.println("n3 is big");
			}
		}

	}
}