package day31_interfaceAndAbstraction.Animal;

public class Cat implements Animal {
	
private String name;
 public Cat(String name) {
	 this.name=name;
 }
public void speak() {
	System.out.println(name+" say meow!!");
}
@Override
public void eat(String food) {
	System.out.println(name+" is eating "+food);
	
}
@Override
public void sleep() {
	// TODO Auto-generated method stub
	
}


}
