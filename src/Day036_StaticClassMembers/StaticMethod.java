package Day036_StaticClassMembers;

public class StaticMethod {
	String name="Apple";
public static void show1() {
	
	
	System.out.println("Hi");
	show2();//u can not call instance method/variable from static method;
	
	show4();//u can call static method from static method;
}
public  void show2() {
	System.out.println("Hi");
	show1();// u can call static from instance variable;
	System.out.println(name);
}
public void show3() {
	System.out.println("Hi");
	show2();// u can call instance method from instance method;
	show1();//u can call static from instance variable
}
public static void show4() {
	System.out.println("Hi");
}
}
