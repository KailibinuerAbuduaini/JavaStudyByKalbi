package Day039_FinalKeyWord;

public class FinalMethod {

	public void method1() {
		System.out.println("method-1");
	}
	public static void staticMethod1() {
		System.out.println("STATIC METHOD");
	}
	
}
class sub extends FinalMethod{
	@Override
	public void method1() {
		System.out.println("method-1 in sub class");
	}
	//overloding
	public void method1(int x) {
		System.out.println("method-1 in sub class");
	}
	
	
	/*// this is return type method
	 * public int method1(int x) {
		return 2;// look at day39 record
	}
	
	This is return type
	 */
	public static void staticMethod1() {
		System.out.println("STATIC METHOD IN SUB CLASS");
	}
}