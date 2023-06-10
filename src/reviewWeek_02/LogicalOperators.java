package reviewWeek_02;

public class LogicalOperators {

	public static void main(String[] args) {
		// && And
		// || OR
		// ! NOT(boolean Condition)
		
		//Comparison and logical operator return as boolean
		
		 // This kind of operator only work with boolean type
	    /*
	     * ConditionA AND ConditionB Result
	     * true && true => true
	     * true && false => false
	     * false && true => false
	     * false && false => false
	     */
	    /*
	     * ConditionA OR ConditionB Result
	     * true || true => true
	     * true || false => true
	     * false || true => true
	     * false || false => false
	     */
	    /*
	    NOT will negate whatever you boolean result is
	    !true => false
	     */

	    boolean result = !(5 > 6); // !(false)
	    System.out.println(result); // true

	    boolean result2 = (true || true) && false || true && false;
	   //                 ((true || true) && false) || (true && false);
	    System.out.println(result2);

	    /**
	     * Starting from the inside out, we have:
	     *
	     * true && false evaluates to false.
	     * true || false evaluates to true.
	     * (true || true) && false evaluates to false.
	     * Finally, ((true || true) && false) || (true && false) evaluates to true.
	     */
		
		
		
		
	}

}
