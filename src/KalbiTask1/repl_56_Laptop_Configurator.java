package KalbiTask1;

import java.util.Scanner;

public class repl_56_Laptop_Configurator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 0;
		double lap_top_price;
		String storageType, screenType, cpu;
		int ram = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Select screen size:");
		double screen_size = scan.nextDouble();
		if(screen_size==13.3) {
			 lap_top_price=price+200;
		}else if(screen_size==15.0) {
			 lap_top_price=price+300;
		}else if(screen_size==17.3) {
			 lap_top_price=price+400;
		}
		
		System.out.println("Select CPU type:");
		String CPU = scan.next();
        if(CPU.contentEquals("i3")) {
        	 lap_top_price=price+150;
        }else if(CPU.contentEquals("i5")) {
        	 lap_top_price=price+250;
        }else if(CPU.contentEquals("i7")) {
       	 lap_top_price=price+350;}
		System.out.println("Select RAM size:");
		ram = scan.radix();
if(ram==4) {
	 lap_top_price=price+50;
}else if(ram==4) {
		System.out.println("Select storage type:");
		String storage_type = scan.next();
		System.out.println("Enter memory size:");
		int memory = scan.nextInt();
		System.out.println("Enter screen resolution:");
		String screen_resolution = scan.next();
		System.out.println("Laptop price is:");

	}

}
