package day29_inharitance;

public class Toyota extends Car {

public Toyota(String model,int year,double price,String color,String miles) {	
	super("Toyota",model,year,price,color,miles);
}
 public void reliable() {
	 System.out.println(brand +" "+year+" "+ "is reliable");
 }

public String toString() {
	return "Toyota [brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + ", color=" + color
			+ ", miles=" + miles + ", toString()=" + super.toString() + "]";
}

	

}
