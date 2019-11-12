package Day034_Constructors_Encupsulation;

public class Light {
	
	
	public Light() {
		this(0,false);
		System.out.println("Returning from constructor no.1");
	}
	public Light(int watt,boolean ind) {
		this(watt,ind,"X");
		System.out.println("Returning from constructor no.2");
	}
	int numOfwatts;
	boolean indicator;
	String location;
	public Light(int numOfwatts, boolean indicator, String location) {
		
		this.numOfwatts = numOfwatts;
		this.indicator = indicator;
		this.location = location;
		
		System.out.println("Returning from constructor no.3");
	}
	
	


}
