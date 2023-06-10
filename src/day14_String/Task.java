package day14_String;

public class Task {

	public static void main(String[] args) {
		String email = "john.smith@gmail.com";
		
//		System.out.println(email.substring(0,10));
String firstname = email.substring(0,email.indexOf('.'));
System.out.println(firstname);
//substring means starts from
String lastname = email.substring(email.indexOf('.')+1,email.indexOf('@'));
System.out.println(lastname);

	}

}
