package day15_Task;

public class Task_Interview {

	public static void main(String[] args) {
		
		 String input = "civic";
	        String reverse = "";
	        //Reverse the string 
	        
	        for (int i = input.length() -1 ;  i >= 0 ; i--) {
	            reverse += input.charAt(i);
	        }
	        
	        System.out.println(input);
	        System.out.println(reverse);
	        
	        
	        // compare it with the original string
	        
	        
	        if (input.equals(reverse)) {
	            System.out.println(input +" is palindrome");
	        }else {
	            System.out.println(input +" is not palindrome");

	        }
	        
		
		
		
		
		
	}

}
