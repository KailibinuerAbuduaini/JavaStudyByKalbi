package Java_Code_Questions;
/*
 * SIB – Static Initialization Block, is the first block to be executed after class is loaded in the memory.
 *  This block is mainly used to initialize static members of a class.
 * IIB – Instance Initialization Block, is executed while instantiating a class. 
 * This block is executed each time you create an object to the class.
 *  This block is mainly used to initialize instance members of a class.
 */
class aaa
{
    static int first;
 
    static String second;
 
    static
    {
        System.out.println(1);
 
        first = 100;
    }
 
    static
    {
        System.out.println(2);
 
        second = "SECOND";
    }
}

public class Question005_Static_Block {
	 static
	    {
	        System.out.println(3);
	    }

	public static void main(String[] args) {
		System.out.println(4);
		 
        System.out.println(aaa.first);
 
        System.out.println(aaa.second);

	}

}

// first ->static block in side the public class->main method sout println->then static blocks in side the  class aaa 