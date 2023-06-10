package day16_week4_review;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int input = 20;
	    for (int number = 2; number <= input ; number++) {

	      // our old isPrime logic
	      boolean isPrime = true;
	      for (int j = 2; j < number; j++) {
	        if (number % j == 0) {
	          isPrime = false;
	          break;
	        }
	      }

	      if (isPrime) System.out.print(number + ",");
	    }
		
		
		
		
	}

}
