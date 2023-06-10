package day19_array;

public class ArrayDemo {

	public static void main(String[] args) {
	//arrays start from zero 	
		int num1 = 5;
        int num2 = 4;
        int num3 = 3;
        int num4 = 2;
        int num5 = 1;
        
        String str = "6";
        
//        array syntax:
//        dataType variableName[ ] = value;
//                      0      1      2    3     4   5
        int nums[] = {num1, num2, num3, num4, num5,6};
        
        // read value
        System.out.println(num1);
        
        System.out.println( nums[0]);
        
        System.out.println(nums[4]);
        
        for (int i = 0; i < 6 ; i++) {
//            System.out.println(i); i ==> index 0 1 2 3 4 5
            System.out.println(nums[i]);
        }
        
      //For String
        String fruits[] = new String[6];
        
        
        
        
        

	}

}
