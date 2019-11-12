package Day034_Constructors_Encupsulation;

public class Floor {
	double widith;
	double length;
	public Floor(double widith, double length) {
		
	
		if(widith<0) {
			this.widith=0;
		}else {
			this.widith=widith;
			
		}
		
		
		if(length<0) {
			this.length = 0;
		}else {
				this.length = length;
			}
		

	}
		
		public double getArea() {
			
			return widith*length;
		}
	}

