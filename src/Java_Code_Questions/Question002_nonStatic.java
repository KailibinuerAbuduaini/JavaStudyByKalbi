package Java_Code_Questions;
class A
{
     int nonStaticVariable;
     static int staticVariable;
 
     static void staticMethod()
     {
          System.out.println(staticVariable);
     //   System.out.println(nonStaticVariable);
     }
 
     void nonStaticMethod()
     {
          System.out.println(staticVariable);
          System.out.println(nonStaticVariable);
     }
}
public class Question002_nonStatic {
	/*
	 * Class : Class is the template/blueprint for the objects to be created of its type.
     Object : It is an instance of a class. 
     Non-Static variables and Non-Static methods are non-static components of a class.
      These are also called instance components of a class. Non-static components are stored inside the object memory. 
      Each object will have their own copy of non-static components.
      But,  static components are common to all objects of that class.
	 */

	public static void main(String[] args) {
		
	     
	          A.staticVariable = 10;
	     //   A.nonStaticVariable = 10;
	          A.staticMethod();//=>10 -->first step;
	    //    A.nonStaticMethod();
	 
	          A a1 = new A();
	          A a2 = new A();
	 
	          System.out.println(a1.nonStaticVariable);//=>0-->second step
	          System.out.println(a1.staticVariable);//=>10-->third step
	          a1.nonStaticMethod();//=>10 ,0-->fourth,fifth step
	          a1.staticMethod();//=>10-->sixth step
	 
	          System.out.println(a2.staticVariable);//=>10-->seventh step
	          a1.staticVariable = 20;
	          System.out.println(a2.staticVariable);//=>20-->eight step
	          
	      
	     }

	}


