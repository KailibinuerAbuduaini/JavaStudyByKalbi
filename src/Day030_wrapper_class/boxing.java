package Day030_wrapper_class;

public class boxing {

	public static void main(String[] args) {
		//  Autoboxing -- > primitive to objact
Integer num1=123;
int n=5;
Integer num2=n;
 // unboxing --> object to primitive
Double d1=new Double(34.2);
double d2=d1;
System.out.println("d1:"+d1);
System.out.println("d2:"+d2);


Long l1= new Long(600000L);// unboxing;
Long l2=new Long(324344345);// no boxing
Long l3=l2;// unboxing;
int x=345;
double y=x;
Integer num3=Integer.valueOf(345);
// Double d3=num3;//casting not with wrapper class

	}

}
