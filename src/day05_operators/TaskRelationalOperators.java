package day05_operators;
import java.util.Scanner;
public class TaskRelationalOperators {

	public static void main(String[] args) {
		//int x = 10;
		//int y = 20;
		
		
		
Scanner scan = new Scanner(System.in); // instance of scanner object
        
        System.out.println("Enter value x");
       
        int x = scan.nextInt();
        
        System.out.println("Enter value y");
        
        int y = scan.nextInt();
        System.out.println(x > y);
        
     System.out.println(x==y);
     System.out.println(x!=y);
     System.out.println(x<y);
     System.out.println(x>y);
     System.out.println(x<=y);
     System.out.println(x>=y);
        
        scan.close();  
		
	}

}
