package day16_week4_review;

public class String_concatMethod {

	public static void main(String[] args) {
		/*
		 if we concat string with int >it will
		 
		combine it > if string come first
*/
		
		 System.out.println("a" + 2);
		    System.out.println(2 + "a");
		    System.out.println("str" + 10 + false);
//		                                          (                 )
		    System.out.println("Hello" + " World" + "!!".toUpperCase());


		    String shortString = "str";
		    int number = 100;

		    String result1 = shortString + number + 50; //string first =>str10050  it will combine 
		    String result2 = number + 50 + shortString; //int first => 150str  it will add 
		    System.out.println(result1);
		    System.out.println(result2);	
		
		
		
	}

}
