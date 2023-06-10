package day25_ClassAndObject;

public class Car {
	//instaNCE variable
String color;
String model;
String brand;
double price;
int year;

//
public void drive() {
	System.out.println("Driving"+ year + " " +brand + " " + model);
}
public void stop() {
	System.out.println( year + " " +brand + " " + model + " has stopped");
}
public void start() {
	System.out.println( year + " " +brand + " " + model + " has started");
}

}
