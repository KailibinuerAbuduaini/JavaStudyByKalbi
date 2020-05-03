package Day036_StaticClassMembers;
import static java.lang.Math.*;
public class StaticImport {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(16));
      System.out.println(sqrt(8));
      method();
	}
    public static void method() {
    	System.out.println("Test");
    }
}
