package Java_Code_Questions;

class AA
{
    static int i;
 
    static
    {
        System.out.println(1);//third step
 
        i = 100;
    }
}

public class Question004_Instance_Initialization_Block {
	static
    {
        System.out.println(2);// FIRST step;
    }
	public static void main(String[] args) {
		   System.out.println(3);// Second step
		   
	        System.out.println(AA.i);// fourth step
	        

	}

}
