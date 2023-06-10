package day_09_loop;

public class PrintAToZ {

	public static void main(String[] args) {
		char letter1 = 'a';
		int num = letter1;
		System.out.println(num);//97

		char letter2 = 'z';
		int num2 = letter2;
		System.out.println(num2);//122
//            65    90
		while(num<=num2) {
			char letter3 = (char)num;
			System.out.println(letter3);
			num++;
			
		}
			
		  
        // Write a program to print lower case 'a' to lower case 'z'
        System.out.println("--------------------");
        int value = 122;
        
        while(value >= 97) {
            
            char letter4 = (char)value;
            System.out.println(letter4);
            value--;
            
        }
                  	
			
		
		
		
		
		
		
	}

}
