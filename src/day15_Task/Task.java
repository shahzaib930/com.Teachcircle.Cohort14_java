package day15_Task;

public class Task {

	public static void main(String[] args) {
	
		String input = "shahzaib@gmail.com";
		String output = "";
		
		if (input.indexOf('@') == -1 ||  input.indexOf('.') == -1)
		output = "Email is invalid";
		else if (input.indexOf('@') < 1)
		output = "Email is invalid";
		else if (input.indexOf('@') < input.indexOf('.'))
			output = "Email is valid";
		else if (input.indexOf('.') < input.length()-1)
			output ="Email is valid";
		else { output = "Email is valid";}
		
		System.out.println(output);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
