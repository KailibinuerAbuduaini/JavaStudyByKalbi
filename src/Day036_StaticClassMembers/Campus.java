package Day036_StaticClassMembers;

public class Campus {
	
	
	private String city;
	static String country;
	
	
	static {
		System.out.println("static block 1");
		country="USA";
	}
	
	
	
public Campus(String city) {
	System.out.println("Constructor");
	this.city=city;
	
}
static {
	System.out.println("static block 2");
	country="UK";
}

}
