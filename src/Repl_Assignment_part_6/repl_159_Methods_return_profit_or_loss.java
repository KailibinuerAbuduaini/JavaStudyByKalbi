package Repl_Assignment_part_6;

public class repl_159_Methods_return_profit_or_loss {

	public static void main(String[] args) {
          System.out.println(c_profis(100,100)); 
	}

	public static  String c_profis(int buyPrice,int sellPrice) {
		if(buyPrice> sellPrice) {
			return "loss";
		}else if(buyPrice<sellPrice){
			return "profit";
			
		}else if(buyPrice==sellPrice) {
			return"no loss";
		}
		return null;
	}
}
