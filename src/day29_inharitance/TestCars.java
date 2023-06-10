package day29_inharitance;

public class TestCars {

	public static void main(String[] args) {
	BMW bmw1 = new BMW( "SE", 2020, 40000,"Black" , "13000.0");
     bmw1.breakdown();
     bmw1.racing();
     bmw1.start();// from super class
     System.out.println(bmw1.toString());
     
     System.out.println("------------------------------");//
     
     
     Tesla tesla1 = new Tesla("Y", 2022, 30000, "White", "5000.0");
	 tesla1.autoPilot();
	 tesla1.drive();// From Super Class
     System.out.println(tesla1.toString());
     
     System.out.println("------------------------------");//
     
     Car car1 = new Car("Ford", "Mustang", 2023, 60000, "Blue", "0.00");
     car1.start();
     car1.drive();
     System.out.println(car1.toString());
	}
     
	
	
	
	
	
}
