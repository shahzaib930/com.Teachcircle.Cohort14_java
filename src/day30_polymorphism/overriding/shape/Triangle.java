package day30_polymorphism.overriding.shape;

public class Triangle extends Shape{
  // how to overrite a method?
	// The method inthe subclass must have the same name
	// return types .and parameter list as the method in the parent class
	public void area() {
		System.out.println("Area of the Triangle");
	}
	
	
}
