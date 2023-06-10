package day16_week4_review;

public class Task_color {

	public static void main(String[] args) {
		/**
	     * Given a string, if the string begins with "red" or "blue"
	     * return that color string, otherwise return
	     * the empty string.
	     */
	    String myStr = "blue";
	    final String RED = "red";
	    final String BLUE = "blue";
	    String result = "";

	    // if the string begins with "red" or "blue"
	    if (myStr.startsWith(RED))
	      result = myStr.substring(0,RED.length());
	    else if (myStr.startsWith(BLUE))
	      result = myStr.substring(0, BLUE.length());

	    System.out.println(result);

	}

}
