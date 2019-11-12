package Repl_assignment_part_3;

import java.util.Arrays;
import java.util.Scanner;

public class repl_94_Parse_HTML {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();

		if (html.contains("html")) {

			String[] id = html.split(" id=\"");
			System.out.println(Arrays.toString(id));
			int a = id[1].indexOf("\"");
			String b = id[1].substring(0, a);
			System.out.println(b);
		} else if (!html.contains("html")) {
			System.out.println("Invalid input!");
		}
	}
}
