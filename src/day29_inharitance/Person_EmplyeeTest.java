package day29_inharitance;

public class Person_EmplyeeTest {
   // still have access from Employee class(subclass) to Person class(parent) data
	// => Parent class doesn't have to SubClass..
	public static void main(String[] args) {
Employee employee1 = new Employee();
        
        employee1.name = "Unknown Name";           // from Person(Parent)
        employee1.age = 24;                        // from Person(Parent)
        employee1.phoneNumber = "7038428429";   // from Person(Parent)
    
        employee1.jobTitle = "Software Developer";  // from Employee(Subclass)
        employee1.salary = 100000;                    // from Employee(Subclass)
        employee1.employeeId = 700;                    // from Employee(Subclass)
        
        System.out.println(employee1.toString());
    
        Person person1 = new Person();
        
        person1.name = "Unknown Name";           // from Person(Parent)
        person1.age = 24;                        // from Person(Parent)
        person1.phoneNumber = "7038428429";   // from Person(Parent)
    
        // Cannot Access the variables from SubClass
//        person1.jobTitle = "Software Developer";  // from Employee(Subclass)
//        person1.salary = 100000;                    // from Employee(Subclass)
//        person1.employeeId = 700;                    // from Employee(Subclass)
        
    }
		

	}


