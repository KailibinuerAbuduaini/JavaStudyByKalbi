package Day016_class_object;

public class DogObjects {

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Dog dog3=new Dog();
		dog1.age=3;
		dog1.name="Almas";
		dog1.breed="hawhaw";
		dog2.name="batur";
		dog3.color="yellow";
		dog3.name="yolwas";
		System.out.println(dog1.age);
		System.out.println(dog2.name);
		System.out.println(dog3.color);
		System.out.println(dog1.breed);
		dog1.barking();
		dog2.hungry();
		dog3.sleeping();

	}

}
