package review_week03;

import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		//infinite loop 
		
		Scanner sc = new Scanner(System.in);
	    int input;
	    while (true) {
	      System.out.println("Enter number between 0 and 10");
	      input = sc.nextInt();

	      if (input <= 10 && input >= 0) {
	        System.out.println("input is valid");
	        break;
	      }
	    }

	
	    System.out.println("Input: " + input);
	    
	    
	    
//Do while loop		
//int a = 0;
//int b = 5;
//do {
//	System.out.println("do something");
//	a++;
//}while (a<5);
//	}
	}
}
