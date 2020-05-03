package Java_Code_Questions;
/*
 * Static variables, Static Initialization Block and Static Methods – 
 * these all are static components or static members of a class. 
 * These static members are stored inside the Class Memory.
 *  To access static members, you do not need to create objects. 
 * Directly you can access them with class name.
 */


class StaticComponents
{
     static int staticVariable;
 
     static
     {
          System.out.println("StaticComponents SIB");//second
          staticVariable = 10;
     }
 
     static void staticMethod()
     {
          System.out.println("From StaticMethod");//third
          System.out.println(staticVariable);// fourth
     }
}

public class Question001_Static {

    static
    {
         System.out.println("MainClass SIB");// first
    }

	public static void main(String[] args) {
		
		//Static Members directly accessed with Class Name
        StaticComponents.staticVariable = 20;
        StaticComponents.staticMethod();

	}

}
