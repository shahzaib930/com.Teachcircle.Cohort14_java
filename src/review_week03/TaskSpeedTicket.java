package review_week03;

public class TaskSpeedTicket {

	public static void main(String[] args) {
	
//
//Write a program that calculates the fine for a speeding ticket. Prompt the user for several items of
//information. These data items will be used to determine the fine.
//
//**Here is what your program must do:**
//
//Prompt for: driver lastName, firstName, age, speedLimit, actual speed, and whether you are in a
//construction zone.
//
//Calculate the components of the fine and the total fine (see rules below).
//
//**Rules to calculate fine:**
//
//1. if driver is less than 5mph over limit, no fine is assessed, but you finish all prompts,
//   calculations and generate the report.
//2. else if driver is over limit by 20mph or less, charge $30 per every 5mph over limit.
//3. else if driver is more than 20mph over limit charge $50 per every 5 mph over limit.
//4. Don't mix rates! - driver is either charged $30 per 5mph over or $50 per 5mph over.
//5. if the violation occurred in a construction zone, you are to **DOUBLE** the fine.
//
//Lastly -- AFTER ALL OTHER CALCULATIONS ARE DONE: if driver is under 21 AND more than 20mph over limit then you must add
//an additional straight $300 underage speeder fine. ** You are NOT to double this
//	
//		
		
		
		
		
		
		int fine = 0;
	    final int THIRTY = 30, FIFTY = 50, UNDERAGE_FINE = 300;
	    //    int currentSpeed = 55;
	    //    int speedLimited = 25;
	    int overSpeed = 21; // currentSpeed - speedLimited
	    boolean isConstruction = true;
	    int age = 18;

	    if (overSpeed < 5) fine = 0; // no fine, less than 5 mph
	    else if (overSpeed <= 20) { // 20mph or less
	      fine = overSpeed / 5 * THIRTY; // charge $30 per every 5mph
	    } else /* if (overSpeed > 20) */ { // more than 20mph over limit
	      fine = overSpeed / 5 * FIFTY; // charge $50 per every 5mph
	    }
	    // 200

	    if (isConstruction) // is it in construction zone
	      fine *= 2; // fine = fine * 2;
	    // 400
	    if (age < 21 && overSpeed > 20) // underage + over 20 mph
	      fine += UNDERAGE_FINE;
	    // 700
	    
	    System.out.println("fine: $" + fine);	
		
		
		
		
		

	}

}
