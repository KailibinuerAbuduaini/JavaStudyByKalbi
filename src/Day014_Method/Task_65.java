package Day014_Method;

public class Task_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateGrade(50,65,70);
	}
public static void calculateGrade(int x, int y,int z) {
	
	
	double Average=(x+y+z)/3;
	if (Average>=90&&Average<=100) {
		System.out.println("your grade is A");
	}else if(Average>=80&&Average<=89) {
		System.out.println("your grade is B");
	}else if(Average>=70&&Average<=79) {	
		System.out.println("your grade is C");
		}else if(Average>=60&&Average<=69) {
			System.out.println("your grade is D");
	}else if(Average>=0&&Average<=59) {
		System.out.println("your grade is F");
}
}
}
