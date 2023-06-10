package day06_operators;

public class Pamdas {

	public static void main(String[] args) {
		 //PEMDAS (Parenthesis, Exponents, Multiplication and Division, Addition and Subtraction) 
        //order. When there are multiple instances of the same precedence, 
        //Java reads from left to right.

        System.out.println(1 + 2 + 3 * 4);
        
        System.out.println((1 + 2) *4 + 3 * 4);
        
        System.out.println((1 + 2) *4 + 3 * 4 - 10 *2 );	

	}

}
