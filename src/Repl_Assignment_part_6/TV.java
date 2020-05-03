package Repl_Assignment_part_6;
/*
 * Write a custom class TV that has 4 instance variables: 
 * int channel=1, int volumeLevel=1, boolean on = false, String brand = "undefined".               
Create one "no arguments" constructor that prints message: "Creating TV object using no Args- constructor". 
Also, create one more constructor that defines instance variable brand,
 and displays message:"Creating TV object using 1 arg - constructor".
 
 Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), 
 channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
 
 
Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.
Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.

Create isOn(), turnOn() and turnOff() methods for "on" instance variable. 
If tv is already on, no need to turn it on again, display message: "TV is already ON".
 If tv is already off, then no need to turn it off again, display message: "TV is already OFF". 
 
 
Value of a variable channel cannot be negative or zero, and cannot be higher than 120. 
If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".
Volume can be only in the range between 1 and 7. 
You may change volume only if TV is on. Otherwise, display message: "ERROR: TV is either OFF or invalid Volume level".
 Create isOn() method that will check tv status.

 
 
 */

public class TV {
	private int channel = 1;
	private int volumeLevel = 1;
	boolean on = false;
	private String brand = "undefined";
	
	public TV() {
	
		System.out.println("Creating TV object using no Args- constructor");
		
	}
	public TV(String brand) {
		
		this.brand = brand;
		
		System.out.println("Creating TV object using 1 arg - constructor");
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void channelUp(int channel ) {
		channel++;
		
	}
	public void channelDown(int channel ) {
		channel--;
		
	}
	
	public void volumeUp(int volumeLevel) {
		volumeLevel++;
		
	}
	public void volumeDown(int volumeLevel) {
		volumeLevel--;
	}
	/*
	 * Create isOn(), turnOn() and turnOff() methods for "on" instance variable. 
If tv is already on, no need to turn it on again, display message: "TV is already ON".
 If tv is already off, then no need to turn it off again, display message: "TV is already OFF". 
	 */
	//isOn(), turnOn() and turnOff() methods
	public void turnOn(boolean on) {
		if(on) {
			System.out.println("TV is already ON");
		}else {
			System.out.println("TV is already OFF");
		}
		
	}
	
	public void turnOff(boolean on) {
		if(on) {
			System.out.println("TV is already ON");
		}else {
			System.out.println("TV is already OFF");
		}
		
	}
	
}
