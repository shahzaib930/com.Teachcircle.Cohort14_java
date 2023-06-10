package day30_polymorphism.overloading;

public class AreaCalculator {

	
	// OverLoading:
	// The method must have the same name as another method within the same class.
	// The method must have different parameter.
	
	// The parameter must different with these 3.
	// 1. Number of parameter
	// 2. Data type of the parameter.
	// 3. Order of the parameter
	// => data type number should not be the same.
	
	// Ex.
	       // public void add(int a,int b)
	       // public void add(int a,int b,int c)
	
	       // will not work.
	       // public void add(int a,int b)
           // public void add(int a,int b)
	
	// Instance Variable:
	public final double PI = 3.14;
	public double getArea(double radius) {
		System.out.print("Circle");
		return PI * radius * radius;
	}
	public double getArea(double a , double b) {
		System.out.print("Rectangle");
		return a*b;
	}
	public double getArea(int h , double b) {
		System.out.print("Triangle");
		return h*b/2;
	}
	public double getArea(double b,int a) {

		return a+b+4;
	}
	
	public static void main(String[] args) {
		// Automatically can switch to other type..when u give the value
       AreaCalculator ac = new AreaCalculator();
        
        System.out.println(ac.getArea(5)); // get area of Circle
        System.out.println(ac.getArea(4.3,9.9)); // get area of Rectangle
        System.out.println(ac.getArea(3, 9.4)); // get area of triangle
        System.out.println(ac.getArea(4.5,3)); // get the generic area
        
        
	}
	
	
	
	
}
