package day21_Method;

public class TwoDArrays {

	public static void main(String[] args) {
		

//      ArrayIndex start from 0
//      Array size is fixed after creation
//      element of same type
//                         0 1 2 3
      int [] evenNums = {2,4,6,8};
      int oddNums[] = {1,3,5,7,9, 11};
//                       0 1 2 3 4  5
      
      System.out.println(evenNums.length);
      System.out.println(oddNums.length);
      
//      evenNums[4] = 10;
//      System.out.println(evenNums[5]);
      
//                        0           1
      int nums[][] = {evenNums, oddNums };
      
      System.out.println(nums.length);
      
      System.out.println(evenNums);
      System.out.println(nums[0]);
      
      System.out.println(evenNums[0]); // 2
      
      System.out.println(nums[0][0]);
      
      System.out.println(nums[0][2]);
      
      System.out.println("---------");
      System.out.println(oddNums[3]);
      System.out.println(nums[1][3]);
      	
		
		
		
		
	}

}
