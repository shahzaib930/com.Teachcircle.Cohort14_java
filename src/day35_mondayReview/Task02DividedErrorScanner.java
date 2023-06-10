package day35_mondayReview;

import java.util.Scanner;

public class Task02DividedErrorScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		try {
		
		double result= a/b;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Divided by not Allowed");
			System.out.println("Please enter a new number");
			
		}finally {
			scan.close();
		}
	}

}
