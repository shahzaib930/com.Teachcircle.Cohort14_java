package day30_polymorphism.overriding.Animal;

public class Horse extends Animal{
	public void makeSound() {
		System.out.println("Horse!!");
	}
	public void walk() {
		System.out.println("Horse is Walking");
	}
}
