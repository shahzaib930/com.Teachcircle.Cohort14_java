package day30_polymorphism.overloading;

public class Calculator {
	// Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add One Double & One Int
    // 5.5 5.5
    public double add(double a, int b) {
        return a + b;
    }

    // Add One Int & One Double
    public double add(int a, double b) {
        return a + b;
    }

    // Subtract Two integers
    public void subtract(int a, int b) {
        System.out.println(a - b);
        System.out.println("Calling Subtract method of (int a, int b)");

    }

    // Subtract two doubles
    public void subtract(double a, double b) {
        System.out.println(a - b);
        System.out.println("Calling Subtract method of (double a, double b)");
    }

    // Subtract One Double & One int
    public void subtract(double a, int b) {
        System.out.println(a - b);
        System.out.println("Calling Subtract method of (double a, int b)");
    }

    // Subtract One int & One Double
    public double subtract(int a, double b) {
//        System.out.println("Calling Subtract method of (int a, double b)");
        return a - b;
    }

    // Multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divide two Integers
    public int divide(int a, int b) {
        return a / b;
    }

    // Divide two doubles
    public double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.subtract(4, 5);
        calc.subtract(4.5, 5);
        System.out.println("-------------");
        System.out.println(calc.multiply(55,5));
        
        
        
    }
}
