package Day014_Method;

public class Task_63 {

	public static void main(String[] args) {
		//Write a function that accepts Fahrenheit and displays the Celcius in the console.
		calculateCelcius(50);
	}
public static void calculateCelcius(double Fahrenheit) {
	double celsius=(Fahrenheit-32)*5/9;
	System.out.println(celsius);
}
}

