package day10_forLoop;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		//int a= 10;
		for(int i = 1 ; i<= 10 ; i++) {
			System.out.println(num+"x"+i+"="+num*i);
		}
		
		scan.close();
		
		
	}

}
