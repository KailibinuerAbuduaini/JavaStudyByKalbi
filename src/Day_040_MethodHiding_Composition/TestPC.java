package Day_040_MethodHiding_Composition;

public class TestPC {

	public static void main(String[] args) {
Dimensions dimensions = new Dimensions(20, 20, 5);
		
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27 inc beast"	, "Acer", 27, new Resolution(2540,1440));
		
		Motherboard theMotherboard = new Motherboard("bj-200", "Asus", 4, 6, "v2.44");
		
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
		
		thePC.getMonitor().drawPixel(1500, 1200, "red");	
		
		
		//call loadProgram() 
		thePC.getMotherboard().loadProgram("Windows 1.0");
		
		//call pressPowerButton()
		thePC.getTheCase().pressPowerButton();

	}

}