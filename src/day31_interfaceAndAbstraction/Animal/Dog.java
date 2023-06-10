package day31_interfaceAndAbstraction.Animal;

public class Dog implements Animal {

	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println(name+" is barking");
		
	}

	@Override
	public void eat(String food) {
		System.out.println(name + " is eating food " + food);
		
	}


	public void sleep() {
		System.out.println("Dog is Sleeping");
		
	}

}
