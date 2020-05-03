package self_exercise;

public class OrderDriver {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order =new Order("f");
		
		order =new Order();
		System.out.println(order.value);
		
	}
	}
class Order{
	String value="t";
	{
		value+="a";
	}
	
	{
		value+="c";
	}
	
public Order()	{
		value+="b";
	}


public Order(String s) {
	value+=s;
}
}
