package Day_040_MethodHiding_Composition;

public class Monitor {

	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;
	
	public void drawPixel(int x,int y,String color) {
		System.out.println("Drawing pixel at " + x + "," +  y + " in color " + color);
	}

	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
}
