package Day024_array_part_1;

public class Task_90 {

	public static void main(String[] args) {
	
		String[] cars = {"HONDA","BMW","TOYOTA", "NISSAN" };
		
		for (int i = 0; i < cars.length; i++) {
		
			if (cars[i].equals("HONDA")) {
				System.out.println("found it");
				break;
			} else {
				System.out.println("not found it");
			}
		}

	}

}
