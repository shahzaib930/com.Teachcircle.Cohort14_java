package day31_interfaceAndAbstraction.Animal;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("Max");
		myDog.eat("Dog food");
		myDog.speak();
		
		Cat myCat = new Cat("Whiskerse");
		myCat.eat("Cat food");
		myCat.speak();
		
		Animal cat1 = new Cat("Queen");
		cat1.speak();
		
		Animal dog1 = new Dog("King");
		dog1.eat("Dog Food");
		dog1.speak();
		dog1.sleep();
	}

}
