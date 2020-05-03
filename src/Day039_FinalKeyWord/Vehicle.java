package Day039_FinalKeyWord;

public class Vehicle {
	String name;
	String size;
	int currentVelocity;
	int currentDirection;
	
	
	
	public Vehicle(String name, String size, int currentVelocity, int currentDirection) {
		super();
		this.name = name;
		this.size = size;
		this.currentVelocity = currentVelocity;
		this.currentDirection = currentDirection;
	}

	public void steer(int direction) {
		
		currentDirection+=direction;
		System.out.println("Vehicle/street: steering at" +currentDirection+"degree");
	}
	
	public void Move(int velocity,int direction) {
		currentDirection=direction;
		currentVelocity=velocity;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}
	public int getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	
	}


