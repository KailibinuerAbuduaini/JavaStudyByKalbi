package Day036_StaticClassMembers;

public class CountableTest {

	public static void main(String[] args) {
		
		int objectCount;
		
		Countable obj1=new Countable();
		Countable obj2=new Countable();
		Countable obj3=new Countable();
		
		objectCount=obj1.getinstanceCount();
		
		System.out.println(objectCount);
		System.out.println(obj3.getinstanceCount());
		
		
	}

}
