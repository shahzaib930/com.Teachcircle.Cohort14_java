package day29_inharitance;

public class Tesla extends Car {

	public Tesla(String model,int year,double price,String color,String miles) {	
		super("Tesla",model,year,price,color,miles);
	}
	
	public void autoPilot() {
		System.out.println(brand+" "+year+" "+model+" has the autoPilot feature" );
	}

	
	public String toString() {
		return "Tesla [brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + ", color=" + color
				+ ", miles=" + miles  + "]";
	}

}
