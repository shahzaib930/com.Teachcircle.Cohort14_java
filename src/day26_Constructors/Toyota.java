package day26_Constructors;

public class Toyota {

	String make;
	String model;
	int year;
	double enginSize;
	String color;
	
	// no argument constructor
	//same name as class name.
	// it has no return value
	
	public Toyota() {
		System.out.println(" calling no argument constructor from class ");
		make = "Toyota";
		enginSize = 2.4;
		start();
	}
	
	
	
	
	
	
	//instance method
	public void start() {
		System.out.println( year +" " + make +" " + model + " has started");
	}
	public void stop() {
		System.out.println( year +" " + make +" " + model + " has stopped");
	}
	public void drive() {
		System.out.println( "Driving "+year +" " + make +" " + model + " has started");
	}
	
	
	
	
}
