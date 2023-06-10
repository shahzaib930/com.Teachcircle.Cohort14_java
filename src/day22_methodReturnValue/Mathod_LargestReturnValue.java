package day22_methodReturnValue;

public class Mathod_LargestReturnValue {

	public static void main(String[] args) {
		
//for(int a : arr) {
//	if(a>largeValue) {
//		largeValue = a;
//	}}
//	return largeValue;
//
		 int[] arr = {4, 1, 2, 5, 0};

	        
	        System.out.println(largestVal(arr));

	    }

	    public static int largestVal(int arr[]) {
	        
	        int largest = 0;
	        for (int n: arr) {
	            if (n > largest) {
	                largest = n;
	            }
	        }
	        
	        return largest;

	    }
	    
	
	
	}


