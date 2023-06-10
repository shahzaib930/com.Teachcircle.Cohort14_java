package day25_ClassAndObject;

public class Task_Car {

	public static void main(String[] args) {
		Car charger = new Car();
		
		charger.brand = "dodge";
		charger.model = "SRt";
		charger.year = 2020;
		charger.color = "Orange";
		charger.price = 60000;
		
		charger.drive();
        charger.start();
        charger.stop();
        
	}

}
