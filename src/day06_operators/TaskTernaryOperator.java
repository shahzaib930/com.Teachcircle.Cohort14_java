package day06_operators;

public class TaskTernaryOperator {

	public static void main(String[] args) {
	
		 int num = 230;
	        
	        
	        String oddOrEven = (num % 2 == 0) ? "Even": "Odd";
	        
	        
	        System.out.println(oddOrEven);
	        
	         oddOrEven = (num % 2 == 1) ? "Odd": "Even";
	        
	         System.out.println(oddOrEven);
	}

}
