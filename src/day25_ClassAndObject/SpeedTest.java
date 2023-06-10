package day25_ClassAndObject;

public class SpeedTest {

	public static void main(String[] args) {
		
	Car1 camry = new Car1();
	
	camry.make = "Toyata";
	camry.model = "camry";
	camry.year = 2020;
	camry.speed = 60;
	

    System.out.println("My car's speed is "+ camry.getSpeed());
    
    camry.accelerate(40);
    
    System.out.println("My car's speed is "+ camry.getSpeed());
    
    camry.brake(20);
    System.out.println("My car's speed is "+ camry.getSpeed());
    
    
    camry.accelerate(30);
    System.out.println("My car's speed is "+ camry.getSpeed());
    
    camry.brake(70);
    
    System.out.println("My car's speed is "+ camry.getSpeed());
	
	
	
	}

}
