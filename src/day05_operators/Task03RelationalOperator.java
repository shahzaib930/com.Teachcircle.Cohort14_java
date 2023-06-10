package day05_operators;

import java.util.Scanner;

public class Task03RelationalOperator {
	public static void main(String[] args) {	
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter x...");
	int x = scan.nextInt();
	System.out.println("Enter y...");
	int y = scan.nextInt();
	scan.close();
	boolean result = x>y;
	System.out.println(x + ">" + y + "" + result);
}

}
	