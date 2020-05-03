package Day038_inheritence_part_2;

public class VehiclesTest {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.display();

	}

}

class Vehicle{
	int maxSpeed=120;
	
}

class Car extends Vehicle{
	
	int maxSpeed=180;
	
	
	void display() {
		System.out.println(" maxSpeed:"+super.maxSpeed); //variable belongs to parent,
		// that way not 180 ,printed from parent so it is 120
		
		System.out.println(" maxSpeed:"+maxSpeed);// method overriding ,so print 180 
		
	}
}