package Day014_Method;

public class maxiq_68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClculateAge(1989);
		System.out.println("you are "+ClculateAge(1989)+" years old.");
		YearsUntilRetirement("kelly", 50);
	}

	public static void YearsUntilRetirement(String name, int year) {

		int YearsUntilRetirement=65-ClculateAge(1989);
		System.out.println(name+" for retirement still have "+YearsUntilRetirement+"years");
		
	}

	public static int ClculateAge(int yearBirth) {
		int current_year = 2019;
		int age = current_year - yearBirth;
		return age;
	}
}
