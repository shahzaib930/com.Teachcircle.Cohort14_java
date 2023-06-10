package review_week03;

public class NestedLoop {

	public static void main(String[] args) {
		//nested loop => loop inside another loop

		for (int i = 0; i < 3; i++) {
//	      System.out.println("Start outer loop");
	      System.out.println("i = " + i);
	      System.out.println("======");
	      // nested
	      for (int j = 0; j < 3; j++) {
//	        System.out.println("Start inner loop");
	        System.out.println("j = " + j);
//	        System.out.println("End inner loop");
	      }

	      System.out.println("=end=outer=loop=");
	    }	
		
		
		
		
		
		
		
	}

}
