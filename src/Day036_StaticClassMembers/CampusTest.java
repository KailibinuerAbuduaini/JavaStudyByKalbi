package Day036_StaticClassMembers;

public class CampusTest {

	public static void main(String[] args) {
		Campus c1=new Campus("Mclean");
		
		Campus c2=new Campus("Arlegton");
		System.out.println(Campus.country);
	}

}
