package day25_ClassAndObject;

public class Car1 {
	//instance variable 
   String make;
	String model; 
	int year;
	double speed;
	
	public void accelerate(double amount) {
		speed+=amount;
	}
	public void brake(double amount) {
		speed-=amount;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	
	
}
