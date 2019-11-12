package Day034_Constructors_Encupsulation;

public class Calculator {

	Floor floor;
	Carpet carpet;
	

public Calculator(Floor floor, Carpet carpet) {
		
		this.floor = floor;
		this.carpet = carpet;
	}


public double getTotalCost() {
	double TotalCost=carpet.getCost() * floor.getArea();
	return TotalCost;
}
	
}
