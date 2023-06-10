package review_Array;
import java.util.Arrays;
public class Array_valueTask {

	public static void main(String[] args) {
		int arr[] = {3,6,9};
		int num[] = new int[arr.length+1];
		
		
		//to display a num between 
		int second = arr[1];
		System.out.println(second);
		
		//Replace
	arr[0] = 1;
	System.out.println(Arrays.toString(arr));
	
	//Remove 9

	
	
	//Sum
	int sum = 0;
	for(int number : arr) {
		sum += number;
	};
	
	System.out.println(sum);
	
	
	
	}
}
