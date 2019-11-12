package Day033_Classes_Objects_constructures;

public class Car{

	
	
	String model;
	String make;
	double miler;
	int year; 
	String color;
	/*
	public Car(String m,String ma,int yr,double ml,String cl) {
		model=m;
		make=ma;
		miler=ml;
		year=yr;
		color=cl;
		*/
	
	public Car(String model,String make,double miler,int year,String color) {
		this.model=model;
		this.miler=miler;
		this.year=year;
		this.make=make;
		
		this.color=color;
	}
	
	
	}

