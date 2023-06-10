package day27_Ecapsulation.A;

public class AccessModofiers {
	
	
	
String name;
private int age;
protected String phoneNumber;
public long id;

//default
//declarations are visible only within the package (package private)
//private
//declarations are visible within the class only
//protected
//declarations are visible within the package or all subclasses
//public
//declarations are visible everywhere



void methodA() {
	System.out.println("Default printed");
}
private void methodB() {
	System.out.println("Private printed");
}
protected void methodC() {
	System.out.println("Protected printed");
}
public void methodD() {
	System.out.println("Public printed");
}
public void callingPrivateMethod() {
	age = 10;
	System.out.println(age);
	methodB();
}

}
