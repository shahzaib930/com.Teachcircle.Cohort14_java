package day29_inharitance;

public class BMW extends Car{

	public BMW(String model,int year,double price,String color,String miles) {	
		super("BMW",model,year,price,color,miles);
	}
	
	 public void breakdown() {
		 System.out.println(brand +" "+ year +" are breakdown");
	 }
	 public void racing() {
		 System.out.println(brand +" "+color +" is racing super fast");
	 }

	
	public String toString() {
		return "BMW [brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + ", color=" + color
				+ ", miles=" + miles + "]";
	}
	 
}
