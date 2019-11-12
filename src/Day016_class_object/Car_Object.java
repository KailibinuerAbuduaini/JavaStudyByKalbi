package Day016_class_object;

public class Car_Object {
	public static void main(String[] args) {

		Car car1=new Car();
		car1.PrintCarInfo();
		car1.make="Ford";
		car1.model="Fiesta";
		car1.color="Black";
		car1.currentSpeed=100;
		car1.PrintCarInfo();
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);
		car1.drive();
		System.out.println("before"+car1.currentSpeed);
		car1.accelerate(20);
		System.out.println("after" + car1.currentSpeed);
		
}
}