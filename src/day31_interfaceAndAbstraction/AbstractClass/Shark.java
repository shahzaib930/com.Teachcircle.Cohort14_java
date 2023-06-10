package day31_interfaceAndAbstraction.AbstractClass;

public class Shark extends Animal implements Wild,Swimmable{

	@Override
	public void eat() {
		System.out.println("Shark love to eat human");
		
	}

	@Override
	public void move() {
		System.out.println("Shark is moving");
	}

	@Override
	public void hunt() {
		System.out.println("Shark can hunt");
		
	}

	@Override
	public void swim() {
		System.out.println("Shark is Swimming");
		
	}

}
