package reviewClassThu;

import java.util.Scanner;

public class Scannertask {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a num...");
		int num = scan.nextInt();

		System.out.println("Enter a num2...");
		int num2 = scan.nextInt();
		
		 for( int a = 1 ; a<=10 ; a++) {
			System.out.println(num +" X"+ a+ "=" +num*a);
		 }
		
		
		
		
		
		
	}

}
