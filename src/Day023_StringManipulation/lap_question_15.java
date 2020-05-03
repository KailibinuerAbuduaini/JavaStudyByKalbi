package Day023_StringManipulation;

public class lap_question_15 {

	public static void main(String[] args) {
		
		String str = "xxxbadxx";
		if (str.substring(0, 3).equals("bad")) {
			System.out.println(true);
		} else if (str.substring(1, 4).equals("bad")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
