package reviewWeek_02;

public class Task10 {

	public static void main(String[] args) {
		// n 10 - 99

	    int input = 47;

//	    int firstDigit =
	    int lastDigit = input % 10; // 5
//	    if (input >= 10 && input < 100) {
	    //      346 % 10; // 6
	    //     234234 % 10; // 4

	    int firstDigit = input / 10; // 4
	    // 2 digits
	    //      99 / 10; //  9
	    //      14 / 10; // 1

	    // 3 digits
	    //   999 / 100 // 9
	    int sumOfDigit = firstDigit + lastDigit;
	    
	    System.out.println("x = " + lastDigit);
	    System.out.println("y = " + firstDigit);
	    System.out.println("Sum of " + input + " is: " + sumOfDigit);	

	}

}
