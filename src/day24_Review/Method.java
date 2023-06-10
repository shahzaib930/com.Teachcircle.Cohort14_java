package day24_Review;

public class Method {

	public static void printHello() {
		
		System.out.println("hello");
	}
		
public static void printHelloToSomeone( String name) {
		
		System.out.println("hello"+ name);	
		

}

public static String massage(String name) {
	System.out.println("hello"+ name);	
	return "hello"+ name;
}
public static char[] massageWithArray(String name) {
	String str ="hello"+ name;	
	return str.toCharArray();
}

}
