package day25_ClassAndObject;

public class ObjCar {

	public static void main(String[] args) {
	// syntax
		//
		// classname variable = new classname();
		Car bmw_x5 = new Car();//default constructor of car class
		bmw_x5.drive();
		bmw_x5.start();
		bmw_x5.stop();
		
		System.out.println("------------");
		
		bmw_x5.brand = "BMW";// 
		bmw_x5.model = "X5";
		bmw_x5.year = 2023;
		bmw_x5.color = "Black";
		bmw_x5.price = 63880;
		
		bmw_x5.drive();
		bmw_x5.start();
		bmw_x5.stop();
		
		
		
		
		
		
	}

}
