package Day033_Classes_Objects_constructures;

public class Mouse {
int numTeeth;
int numWhiskers;
int weight;

public Mouse(int weight) {
	this(weight,16);
	System.out.println("hello,do u like?");
}

public Mouse(int weight,int numTeeth) {
	this(weight,numTeeth,6);
	System.out.println("i love java");
}
public Mouse(int weight,int numTeeth, int numWhiskers) {
	super();
	this.numTeeth = numTeeth;
	this.numWhiskers = numWhiskers;
	this.weight = weight;
	System.out.println("i love constructor");
}
public void print() {
	System.out.println(weight+" "+numTeeth+" "+numWhiskers);
}
}
