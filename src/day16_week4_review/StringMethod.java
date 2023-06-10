package day16_week4_review;

public class StringMethod {

	public static void main(String[] args) {
	//length starts from 1	
	//index starts from 0	
		
		// index        01234567890
	    String myStr = "Hello World";
	    // length       12345678901

	    // index      012
	    // length     123
	    String str = "abc";

	    int length = myStr.length(); // length count start from 1
	    System.out.println(length); // 11

	    // charAt()
	    char firstLetter = myStr.charAt(0);
	    System.out.println(firstLetter);

	    // last character => need last index
	    int lastIndex = myStr.length() - 1;
	    char lastLetter = myStr.charAt(lastIndex);
	    System.out.println(lastLetter);

	    System.out.println("".isEmpty()); // is the str has 0 length
	    System.out.println("  \t \n ".isBlank()); // is the str has any character
	    // toUpperCase()  , toLowerCase()
	    // startWith()
	    System.out.println("Anthony".startsWith("Ant"));
	    System.out.println("Anthony".startsWith("th", 2));
	    // endWith() opposite of startWith()
	    // contains()
	    System.out.println(myStr.contains(" "));
	    System.out.println(myStr.contains("xyz"));

	    // indexOf() start search from the front of Str
	    System.out.println(myStr.indexOf("xyz"));

	    //  01234567890
	    // "Hello World";

	    // lastIndexOf() start search from the back of Str
	    System.out.println(myStr.indexOf("l")); //  2
	    System.out.println(myStr.indexOf("l",6)); // 9
	    System.out.println(myStr.lastIndexOf("l")); // 9
	    System.out.println(myStr.lastIndexOf("l", 8)); // 3

	    // subString()
	    System.out.println(myStr.substring(4));
	    System.out.println(myStr.substring(5, 8));

	    // trim()  remove with space from beginning & end of the str
	    // replace()
	    System.out.println(myStr.replace('l', 't'));
	    System.out.println(myStr.replace("Hello", "Hi"));

	    System.out.println(myStr); // still the same string

	}

}
