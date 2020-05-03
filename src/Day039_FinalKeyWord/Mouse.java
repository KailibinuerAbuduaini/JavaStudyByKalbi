package Day039_FinalKeyWord;

public class Mouse extends Rodent {
	protected int tailLength=8;
	
	public void getMouseDetails() {
		System.out.println( "tail:"+tailLength+"parent tails "+super.tailLength);
	}

}
