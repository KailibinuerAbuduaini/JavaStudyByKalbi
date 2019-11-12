package Day023_StringManipulation;

public class lap_question_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xxbadxx";
		if (str.substring(0, 3).contentEquals("bad")) {
			System.out.println(true);
		} else if (str.substring(1, 4).contentEquals("bad")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
