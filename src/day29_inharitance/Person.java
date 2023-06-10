package day29_inharitance;

public class Person {
	//Instance Variables
    String name;
    int age;
    String phoneNumber;
    
    //Instance  Methods
    public void eat() {
        System.out.println(name + " is eating food");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    public void drink() {
        System.out.println(name + " is drinking");
    }
}
