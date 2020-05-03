package Repl_Assignment_part_6;
/*
 * Carpet class has following public double instance variables: width, length, unitPrice, totalPrice
and a public boolean variable isPersian. true if carpet object is Persian and false if it is not.

Add following constructors:

1) No-Args constructor
  -sets default values for the Carpet object
   Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. unitPrice is set as 0.

2) 4-Args  Constructor:
- accepts width, length, unitPrice, isPersian  parameters and assigns values to public instance variables.
 try to use this. keyword

Set totalPrice as the width + length multiplied by the unitPrice.

if its a Persian carpet add 200 to totalPrice.
 */
public class Carpet {
	public double width;
	public double length;
	public double unitPrice;
	public double totalPrice;
	public boolean  isPersian;
	
	public Carpet() {
	this.length=300;
	this.width=300;
	this.totalPrice=200;
	this.unitPrice=0;
	this.isPersian=false;
	}
	public Carpet(double width, double length, double unitPrice, boolean isPersian) {
		
		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.isPersian = isPersian;
	
		
		totalPrice=(width+length)*unitPrice;
		if(isPersian) {
			totalPrice+=200;
		}
	
	}
	
	
	

}
