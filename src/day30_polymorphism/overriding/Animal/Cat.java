package day30_polymorphism.overriding.Animal;

public class Cat extends Animal{
	public void makeSound() {
		System.out.println("Meow!!!");
	}
	public void walk() {
		System.out.println("Cat is Walking");
	}
}
