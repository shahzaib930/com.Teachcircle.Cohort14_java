package day25_ClassAndObject;

public class LocalVariable {

	public static void main(String[] args) {
		// static method we can call it directly in static method
		// but non static method cannot be call directly in static method
		
		
		
		
		
		
		
		int a = 4;
		int b = 3;
		addition();
		for(int i = 0 ; i<5 ;i++) {
			System.out.println("hello" + i);
		}
		System.out.println(a + b);
		
		/////non static///
		
		
		
	}
	public static void addition() {	
		int a = 40;
		int b = 50;
		System.out.println(a + b);
	}
public void subtraction() {
	int a = 40;
	int b = 50;
	System.out.println(a - b);
}
	
	
}

