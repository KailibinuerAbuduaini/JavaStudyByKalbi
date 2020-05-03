package Day036_StaticClassMembers;

public class AllBlocks {
	
	public AllBlocks(int x) {
		System.out.println("one argument constructor");
	}
	
	
	public AllBlocks() {
		System.out.println("no argument constructor");
	}
	
	
	
	
	
	static {
		System.out.println("first static init 1 ");
	}
	
	
	
	
	{
		System.out.println("first static init 2");
	}
	
	
	{
		System.out.println("second static init 2");
	}
	
	
	
	static {
		System.out.println("second static init 3");
	}
	
}
