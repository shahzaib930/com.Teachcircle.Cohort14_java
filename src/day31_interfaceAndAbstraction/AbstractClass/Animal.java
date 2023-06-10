package day31_interfaceAndAbstraction.AbstractClass;
// Abstract => we must put Abstract infront of class
abstract public class Animal {
	
// in abstract class you can have a method by putting (abstract) keyword
// when we extend in subClass it will show on only where you put (Abstract) keyword,..
	
	abstract public void eat();
	abstract public void move();
	// we can create a method
	public void drink() {
		System.out.println("Animal are drinking");
	}
	
	
	
	
	
	
}
