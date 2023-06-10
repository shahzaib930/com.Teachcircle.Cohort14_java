package day14_String;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a 5 letter word");
        String input = scan.next();
        String output = "";
        int length = input.length();
        
        if (length < 5) {
            System.out.println("Sorry too short");

        } else if (length > 5) {
            System.out.println("Sorry too long");

        }else {
            for (int i = input.length() - 1; i >= 0; i--) {
                output += input.charAt(i);
            }
        }
        System.out.println(output);
        
        scan.close();
}
		
		
		

	}


