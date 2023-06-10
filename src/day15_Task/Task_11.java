package day15_Task;

public class Task_11 {

	public static void main(String[] args) {
		
		String word = "Xray";
		String output = "";
		if (word.charAt(0) == 'X' ) 
		output = word.substring(1);
		else {output  = "Error";}
		System.out.println(output);
	}

}
