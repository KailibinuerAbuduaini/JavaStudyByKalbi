package KalbiTask1;

import java.util.Scanner;

public class repl_56_Laptop_Configurator {

	public static void main(String[] args) {
		
		double price = 0;
	
		String storageType, screenType, cpu;
		int ram = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Select screen size:");
		double screen_size = scan.nextDouble();
		if(screen_size==13.3) {
			price+=200;
		}else if(screen_size==15.0) {
			price+=300;
		}else if(screen_size==17.3) {
			price+=400;
		}
		
		System.out.println("Select CPU type:");
		String CPU = scan.next();
        if(CPU.contentEquals("i3")) {
        	price+=150;
        }else if(CPU.contentEquals("i5")) {
        	price+=250;
        }else if(CPU.contentEquals("i7")) {
        	price+=350;
       	 }
		System.out.println("Select RAM size:");
		ram = scan.radix();
		if (ram % 4 == 0) {
			int rate = ram / 4;
			price = price + rate * 50;
		}

		System.out.println("Select storage type:");
		storageType = scan.next();

		System.out.println("Enter memory size:");
		int memorySize = scan.nextInt();

		if (storageType.equals("HDD")) {

			int rate1 = memorySize / 500;
			price = price + rate1 * 50;

		}

		if (storageType.equals("SSD")) {

			int rate2 = memorySize / 500;
			price = price + rate2 * 100;

		}

		System.out.println("Enter screen resolution:");
		screenType = scan.next();

		if (screenType.equals("FULLHD")) {
			price += 100;
		} else if (screenType.equals("4K")) {
			price += 200;
		}

		System.out.println("Laptop price is: $" + price);

		scan.close();
	}

}
