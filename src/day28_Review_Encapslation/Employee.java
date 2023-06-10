package day28_Review_Encapslation;

public class Employee {
	private String name;
    private int age;
    private String department;
    private double salary;
    
    
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDepartment() {
        return this.department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void speak() {
        System.out.println("Hello, my name is " + name + " and I work in the " + department);
    }
    public void work() {
        System.out.println("Working hard to meet our company goals");
    }
    public void recieveRaise(double amount) {
        salary += amount;
        System.out.println("Congrats! You have received a raise. Your new salary is $" + salary);
    }
    
    
	
}
