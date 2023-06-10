package day04_1streview;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// scanner class=> accecpt input from user
Scanner scanner = new Scanner(System.in);
System.out.println("What is your name?");	
String input = scanner.next();//first and last should be same 
//.next() = will capture the world unti the white space
//nextint()=> integer
//nextdouble=> double
//nextBoolean=> boolean
	System.out.println(input);	
		
	scanner.close();	
	}

}
