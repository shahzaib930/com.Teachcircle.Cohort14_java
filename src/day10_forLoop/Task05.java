package day10_forLoop;

public class Task05 {

	public static void main(String[] args) {
		for (int i = 'A' ; i<='Z' ; i++) {
			char letter = (char)i;
			System.out.println(letter);
		}
		 System.out.println("------------");
	        for(int i = 'a'; i <= 'z'; i++) {
	            char letter = (char)i;
	            System.out.println(letter);
	        }
	        
	        
	        System.out.println("---------------------------");
	        for(int i = 'Z'; i >= 'A'; i--) {
	            char letter = (char)i;
	            System.out.println(letter);
	        }
	        
	        System.out.println("---------------------------");
	        for(int i = 'z'; i >= 'a'; i--) {
	            char letter = (char)i;
	            System.out.println(letter);
	        }
	        
		
		
		

	}

}
