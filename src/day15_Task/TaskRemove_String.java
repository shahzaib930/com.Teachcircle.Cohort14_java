package day15_Task;

public class TaskRemove_String {

	public static void main(String[] args) {
		String input = "learning never Stop";
		
		
		input = input.replace("a", "");
		input = input.replace("s", "");
		input = input.replace("t", "");
		input = input.replace("p", "");
		input = input.replace("e", "");
		System.out.println(input);

	}

}
