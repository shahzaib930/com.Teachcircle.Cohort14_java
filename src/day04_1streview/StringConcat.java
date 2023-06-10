package day04_1streview;

public class StringConcat {

	public static void main(String[] args) {
		String cat = "Spark" + " is not a normal cat";
		String cat2 = new String("Spark"); //new always use when we using the same word again
		// this is the old syntax
	    System.out.println(cat + 
	        " is sick." + 
	        " so, I " + 
	        " take him to the vet." + cat2);
	}

}
