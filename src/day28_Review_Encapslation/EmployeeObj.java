package day28_Review_Encapslation;

public class EmployeeObj {

	public static void main(String[] args) {
		Employee john = new Employee("John", 29, "Sales", 50000);
        Employee adam = new Employee("adam", 25, "QA", 80000);
        Employee mary = new Employee("mary", 24, "Software developer", 120000);

        //Test out the getter methods
        System.out.println("Name: " + john.getName());
        System.out.println("Mary's age: " + mary.getAge());
        System.out.println("Adam's Department: " + adam.getDepartment());
        System.out.println("John's Salary: " + john.getSalary());
//        System.out.println("John's Salary: " + john.salary); // Cannot access directly because it is private

        //Test out the setter methods
        mary.setAge(26);
        adam.setDepartment("DB");
        john.setSalary(80000);
        
        john.speak();
        adam.recieveRaise(20000);
        
        System.out.println("ADAM SALARY: " + adam.getSalary());
        
		
		
	}

}
