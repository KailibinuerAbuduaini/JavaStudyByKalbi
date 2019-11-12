package Day020_String_manupilation;

public class String_equals_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="welcome to java";
String s2="welcome to java";
String s3="welcome to C++";

boolean b1=s1.equals(s2);
boolean b2=s1.equals(s3);
System.out.println(b1+"|"+b2);
boolean b3=s1==s2;
boolean b4=s1==s3;
System.out.println(b3+"|"+b4);

String s4=new String("Welcome to java");
System.out.println(s1==s4);
System.out.println(s1.equals(s4));


	}

}
