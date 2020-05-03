package Repl_Assignment_part_6;

public class repl_203_OOP_carpet_class {

	public static void main(String[] args) {
		Carpet c = new Carpet();
		System.out.println(c.totalPrice);
		
		Carpet c2 = new Carpet(20.0, 20.0 , 2.0 ,false);
		System.out.println(c2.totalPrice); 

        Carpet c3 = new Carpet(20.0, 20.0 , 2.0 ,true);
        System.out.println(c3.totalPrice);
        
        

	}

}
