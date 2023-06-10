package day26_Constructors;

public class ToyotaObject {

	public static void main(String[] args) {
		
		
		Toyota camry = new Toyota();
		System.out.println(camry.make);
		System.out.println(camry.color);

		camry.start();
		camry.stop();
		camry.drive();
		
		System.out.println("-------------");
		
		
		camry.year = 2020;
		camry.color = "brown";
		camry.model = "LE";
	
		System.out.println(camry.enginSize);
		
		camry.start();
		camry.stop();
		camry.drive();
		
		
		
		
	}

}
