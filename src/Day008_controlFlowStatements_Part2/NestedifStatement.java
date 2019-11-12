package Day008_controlFlowStatements_Part2;

public class NestedifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isRoushHour=true;
		int carType=1;
		double price=0.0;
		if(carType==1) {
		if(isRoushHour) {
			price=30.0;
		}else {
			price=5;
		}
		}
		
		else if(carType==2){
			if(isRoushHour) {
				price=55.30;		
		}else{
			price=15.99;
			}
		}
		
   System.out.println("total cost:" + price);
}
}
