package Day039_FinalKeyWord;

public class Car extends Vehicle {
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	public Car(String name, String size, int currentVelocity, int currentDirection, int wheels, int doors, int gears,
			boolean isManual, int currentGear) {
		super(name, size, currentVelocity, currentDirection);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = currentGear;
	}
	
	public void changeGear(int currentGear) {
		this.currentGear=currentGear;
		System.out.println("car.changeGear():change to "+this.currentGear+"gear");
	}
		public void changeVelocity(int speed,int direction) {
			Move(speed,direction);
			System.out.println("Car.changeVelocity()");
		}

		@Override
		public String toString() {
			return "Car [wheels=" + wheels + ", doors=" + doors + ", gears=" + gears + ", isManual=" + isManual
					+ ", currentGear=" + currentGear + "]";
		}
		
	}


