package Day017_class_object;

public class BMW {
	String make;
	String model;
	double price;
	public void showPrice() {
	
	switch(model) {
	case"330i":
		price=40250;
		break;
	case"740i":
		price=85000;
		break;
	case"m3i":
		price=65000;
		break;
		default:
			System.out.println(model+"is not available");
			price=0.0;
	}
	System.out.println("Price:"+price);

}
}