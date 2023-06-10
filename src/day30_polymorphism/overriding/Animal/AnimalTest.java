package day30_polymorphism.overriding.Animal;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();

        
        cat1.makeSound(); 
        cat1.walk();
        
        horse1.makeSound();
        horse1.walk();
        
        
        // Super Type = new Sub Type
        
        Animal a = new Cat();
        Animal b = new Horse();
        
        a.walk(); 
        b.walk();
        
        a.makeSound();
        
        
        ArrayList<Cat> cats = new ArrayList<>();
        
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        
        
        ArrayList<Horse> horses = new ArrayList<>();
        
        horses.add(horse3);
        horses.add(horse2);
        horses.add(horse1);
        
        ArrayList<Animal> list = new ArrayList<>();
        list.addAll(cats);
        list.addAll(horses);
        
	

	}

}
