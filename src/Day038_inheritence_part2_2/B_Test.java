package Day038_inheritence_part2_2;

import Day038_inheritence_part_2.B;

public class B_Test extends B {

	public static void main(String[] args) {
		B_Test obj=new B_Test();
		// in here B_Test is also template of object obj, aherini guzal biliu ^v^
		
		obj.display() ;// at the begining  you cant access display method ,
		// because you are in different package,
		//in different class,  because it is protected
  // later on we extends B_Test to B as a parent class , and import B, 
		//then we are able to access display method in other package
		
	}

}
