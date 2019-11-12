package Day025_for_each_loop;

public class for_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] products= {"Timberland","Shirt","Watch","Bag","Shoes"};
		double [] prices= {120.0,123.0,80.0,230.0};
		for(String prod:products) {
			System.out.println(prod);
		}
		for(double pay:prices) {
			System.out.println(pay);
		}
		for(int i=products.length-1;i>=0;i--) {
			System.out.println(products[i]);
		}
	}

}
