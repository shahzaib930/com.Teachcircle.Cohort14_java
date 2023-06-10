package day27_Ecapsulation;

public class Person {
	/*
	 
	 Requirements:
	1, Create a class called Person with the following attributes:
	
	name (String)
	age (int)
	address (String)
	
	1.5, Implement encapsulation by making the name, age, and address attributes private.
	
	2, Create public getter and setter methods for each attribute.
	
	3, Implement validation in the setter methods to ensure that the age attribute 
	   is between 0 and 120, and that the name and address attributes are not empty.
	
	4, Create a constructor for the Person class that accepts values for the name, 
	   age, and address attributes and initializes them using the setter methods.
	
	
		
	
	*/
	
	
	
//	instance Varaibles
	private String name;
	private int age;
	private String address ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		if (!name.trim().isEmpty() ) {
			this.name = name;
		}else {
			System.out.println("Name can not be empty");
		}
		
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}else {
			System.out.println("age attribute is between 0 and 120");
		}
		
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if (!address.trim().isEmpty()) {
			this.address = address;
		}else {
			System.out.println("Address can not be empty");
		}
		
	}
	
	
	
//	4, Create a constructor for the Person class that accepts values for the name, 
//	   age, and address attributes and initializes them using the setter methods.
	public Person(String name, int age, String address) {
		setName(name);
		setAge(age);
		setAddress(address);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}