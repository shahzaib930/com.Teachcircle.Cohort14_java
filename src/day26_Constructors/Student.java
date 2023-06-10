package day26_Constructors;

public class Student {
	
	// constructor is special method to create an object
	//  if we don't create any constructor 
	
	
	String name;
	long id;
	int age;
	char gender;
	
	
	
	
	
	public void study(String topic) {
		System.out.println(name + "is studing " + topic);
	}
	public void takeExam(String subject) {
		System.out.println(name + "is taking " + subject + " exam");
	}
	

}
