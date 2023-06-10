package day25_ClassAndObject;

public class Task_Person {

	public static void main(String[] args) {
		Person abdullah = new Person(); // class instantiation

        // assign value to instance variables
        abdullah.age = 20;
        abdullah.name = "Sharuhan";
        abdullah.occupation = "SDET";

//        abdullah.whatIsYourOccupation();
        System.out.println(abdullah.whatsYourName());
        System.out.println(abdullah.whatIsYourOccupation());
        System.out.println(abdullah.howOldAreYou());

        Person payz = new Person();
        payz.name = "Payzulla Hasan";
        payz.age = 40;
        payz.occupation = "Developer";
        
        
        
        
	}

}
