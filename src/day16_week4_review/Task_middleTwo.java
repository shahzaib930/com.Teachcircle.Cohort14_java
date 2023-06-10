package day16_week4_review;

public class Task_middleTwo {

	public static void main(String[] args) {
		/*
		 
Given a string of even length, return a string
 made of the middle 
two chars, so the string "string"
yields "ri". The string length will be at least 2.
 
		 */
	String str = "string";
	String output = "";
	int middleLength = str.length()/2;
	 System.out.println("" +
		        str.charAt(middleLength - 1) + str.charAt(middleLength));
		
		
		
	}

}
