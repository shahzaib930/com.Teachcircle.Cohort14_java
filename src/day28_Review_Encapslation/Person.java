package day28_Review_Encapslation;

/*
 * Task: Create a class called "Person" along with the following instance
 * variables:
 * 
 * name (String) age (int) occupation (String) address(String) isMarried(boolean)
 * 
 * Create a constructor for the class that takes in values for all 5
 * instance variables and initializes them.
 * 
 * Create the following methods for the class:
 * 
 * birthday() - increments the age of the person by 1 
 * 
 * changeOccupation(String newOccupation) - updates the person's occupation to the new value passed in as a parameter
 * 
 * move(String newAddress) - updated the person's address 
 * 
 * getMartialStatus() - returns true or false based on the martial status of the person.
 * 
 * introduce() - prints out a statement introducing the person with their name, age, occupation, address and isMarried
 * 
 */
public class Person {

	 String name;
	 String occupation;
     int age;
     boolean isMarried;
	 String address;
	
	public Person(String name, int age,String occupation,String address,boolean isMarried) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		this.address = address;
		this.isMarried = isMarried;
	}
	
	public int birthday() {
		return age+1;
		
	}
	public String occupation(String newOccupation) {
		return (occupation = newOccupation);
	}
	public String move(String newAddress) {
		return (address=newAddress);
	
	}
	public boolean getMarriedStatus() {
	if(isMarried) { return true;
	}else { return false;}
	
	}
	
	public void introduce() {
		System.out.println( name + age + occupation + address + isMarried);
	}
	
	
}
