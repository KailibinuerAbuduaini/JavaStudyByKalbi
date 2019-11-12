package Day024_array_part_1;

public class Task_90_ozzy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari" };

		boolean flag = false;

		for (int i = 0; i < cars.length; i++) {
			
			if (cars[i].equals("Honda")) {
				
				flag = true;
				break;
			}

		}

		if (flag) {
			System.out.println("Found it");
		} else {
			System.out.println("Not fount it");
		}


	}

}
