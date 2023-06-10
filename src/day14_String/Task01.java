package day14_String;

public class Task01 {

	public static void main(String[] args) {
	
	//Write a program to reserve of String	
		
		 String input = "abc";
	        
	        String output = "";
	        
	        output += input.charAt(2);
	        output += input.charAt(1);
	        output += input.charAt(0);
	        System.out.println(output);
	        
	        output = "";
	        
	        for (int i = input.length() -1 ; i >= 0 ; i--) {
	            output+= input.charAt(i);
	        }
	        
	        
	        System.out.println(output);
	        

	
		
		
		
		
		

	}

}
