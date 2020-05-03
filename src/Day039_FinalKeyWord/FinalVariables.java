package Day039_FinalKeyWord;

public class FinalVariables {
	public final int RODA_MAX_RANGE=600;
	public final int MAX_COUNT=500;
	public final int MODEL_MAX_3_SPEED;
	
	public final int MODEL_MAX_X_PASSENGER;
	
	public static final String ADMIN_USERNAME;
	
	// this is constructor
	public FinalVariables() {
		MODEL_MAX_3_SPEED=190;
		
	}
	
//this is constructor
	public FinalVariables(int num) {
		MODEL_MAX_3_SPEED=num;
	}
	
	
	
	static{
		ADMIN_USERNAME="KELLY";// this part is important 
		}
	{
		MODEL_MAX_X_PASSENGER=7;
	}
	public static void main(String[] args) {
		
		final int MAX_PASSENGER_COUNT=5;
		//MAX_PASSENGER_COUNT=10; THIS IS WRONG
		
		final double PI=3.14;
		final int ssn;
		ssn=66;
		// ssn+=666;you can notdo this
		
		FinalVariables A=new FinalVariables();
		System.out.println("RODA_MAX_RANGE"+RODA_MAX_RANGE);//DIFFERENCE BETWEEN THESE TWO CODE
		System.out.println("RODA_MAX_RANGE"+A.RODA_MAX_RANGE);//
	}

}
