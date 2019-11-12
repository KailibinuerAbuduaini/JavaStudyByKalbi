
public class DISCOUNT {

	public static void main(String[] args) {
		//calculate sale price 
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount=regularPrice*0.2;
		salesPrice=regularPrice-discount;
		System.out.println("regular price:$" + regularPrice);
		System.out.println("Discount Amount:$" + discount);
		System.out.println("sales Price:$"+salesPrice);
		

	}

}
