package Day031_ArrayList;

import java.util.ArrayList;

public class Cities {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("London");
		cities.add("Hotan");
		cities.add("Kashqer");
		cities.add("urumchi");
		cities.add("Ghulja");
		cities.add("korla");

		System.out.println(cities.toString());

		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		for (String city : cities) {
			System.out.println(city + "");

		}
		cities.add(0, "Arlington");
		cities.add(1, "canada");
		System.out.println(cities.toString());

		int idx = cities.indexOf("Bursa");
		System.out.println(idx);
		System.out.println(cities.indexOf("Bursa"));

		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);
	}

}
