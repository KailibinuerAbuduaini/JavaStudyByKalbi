package Day038_inheritence_part_2;

public class DogTest {

	public static void main(String[] args) {
		Dog dog=new Dog("mister", 1, 1, 8, 20, 2, 4, 1, 20, "sily");
		//dog.eat();//this means: find the Dog class and run eat method 
		// if eat () does not exist in Dog class - check if there is any is-a 
		// relationship according to "extends"word
		// if yes - go to parent class
		
		//dog.run();
		
		dog.move(10);// fist compiler will check dog object which class created from 
		// it is created from Dog class the it will go Dog class move method
	
	}

}
