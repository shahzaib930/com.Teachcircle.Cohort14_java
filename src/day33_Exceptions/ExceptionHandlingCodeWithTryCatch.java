package day33_Exceptions;

public class ExceptionHandlingCodeWithTryCatch {

	public static void main(String[] args) {
	
		int a =7,b=0;
		
		//Start
		try {
		int result = a/b;
		System.out.println(result);// --> run if no error..
		//        error type --> yu can also  write Exception or Throwable
		// * ArithmeticException
		// * Exception
		// * Throwable
		}catch(ArithmeticException e) {// --> run if error..
			// exception handling code here
			e.printStackTrace(); // to print the error....<REd line>
			System.out.println(e.getMessage());
		}
		System.out.println("Program is Completed");
		System.out.println("Can run next test case");
		//End
	}

}
