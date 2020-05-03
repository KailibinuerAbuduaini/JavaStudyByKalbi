package Day036_StaticClassMembers;

public class StaticInt {
	public static final int NUM_SECONDS_PER_HOURS;
	
	
	static {
		System.out.println("static block");
		int numSecondPerMinut=60;
		int numMinutPerHours=60;
		NUM_SECONDS_PER_HOURS=numSecondPerMinut+numMinutPerHours;
	}

	private static int one;
	private static final int two;
	private static final int three=3;
	
	private static final int four;
	static {
		one=1;
		two=2;
		three=3; // we already initialize it once so you can not change it it is final
		two=4;// we only can change  one time , this is also wrong
				
		
	}
	
	
}
