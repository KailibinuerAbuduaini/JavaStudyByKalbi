package Day036_StaticClassMembers;

public class Dinner {
	static int PizzaSlice=8;
	public void takeSlice() {
		PizzaSlice--;
	}
	public void takeSlice(int count) {
		PizzaSlice-=count;
	}
}
