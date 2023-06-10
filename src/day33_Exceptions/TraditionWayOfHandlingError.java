package day33_Exceptions;

public class TraditionWayOfHandlingError {
	// Program will stop there where problem occurring..(facing)
	// Use if statement to avoid error
	

	public static void main(String[] args) {
   int a=7,b=0;
   if (b!=0) {
	   System.out.println("result"+a/b);
   }else {System.out.println("B is zero");
   }
	System.out.println("Program is completed");
	
	////////////////
	String str = null;
	//System.out.println(str.length());
	
	if (str!=null) {
		   System.out.println("result"+str.length());
	   }else {System.out.println("Str is null");
	   }
	
	//////////////
	int nums[]= {1,2,3,4};
	if (nums.length>=10) {
	System.out.println(nums[10]);
	}else {System.out.println("Length is smaller than 10");}
	}
}
