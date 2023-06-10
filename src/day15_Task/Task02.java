package day15_Task;

public class Task02 {

	public static void main(String[] args) {
		
	/*	
	 Task7
Write a method that asks user to enter a string.
 if the string is empty, print: string is empty 
 if the string has more than 3 characters, 
 print the last three characters 
 if the string has less than or equal 3 characters, print the string itself
  
	  
	 * 
	*/	
	
		String input = "Task";
		String output = "";
		if (input.length() == 0)
		output = "Empty String"; //also can use =>  input.isEmpty()
		else if (input.length() >3)
	output = input.substring(input.length()-3);//Substring ; use to start from....
		else if (input.length()<=3)
			output = input;
System.out.println(output);



	}

}
