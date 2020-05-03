package Day008_controlFlowStatements_Part2;

public class quiz {

	public static void main(String[] args) {
		
	boolean b1=false;
	boolean b2=false;
	if(b2!=(b1=!b2)) {
		System.out.println("t");
	}else {
		System.out.println("f"); 
		
	}
	
	// 
	
	int numbWater;
	boolean lotsOfWater ;
	lotsOfWater=false;
	
	numbWater=40;
	
	if (numbWater>=20) {System.out.println("ihave");
	lotsOfWater=true;}
	
	if (lotsOfWater) {System.out.println("good");}

	if (lotsOfWater==false) {System.out.println("i need");}
	
}
}