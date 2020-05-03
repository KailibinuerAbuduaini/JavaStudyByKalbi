package Java_Code_Questions;
class B{
     int i;
 
     {
          System.out.println("First IIB Block");// first step
     }
 
     {
          System.out.println("Second IIB Block");// second step
     }
 
    B(int j)
     {
          this();// calling default constructor
          System.out.println("First Constructor");// fourth step
     }
 
     B()
     {
          System.out.println("Second Constructor");// third step;
     }
}

public class Question003_Instance_Initialization_Block {

	public static void main(String[] args) {
		  B a = new B(50);

	}

}
