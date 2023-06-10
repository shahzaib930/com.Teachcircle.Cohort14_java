package day24_Review;

import java.util.ArrayList;

public class Task {
	 public static ArrayList<Integer> reverseArray (int arr[]) {
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        for (int i = arr.length - 1; i >= 0; i--) {
	            list.add(arr[i]);
	        }
	        
	        return list;
	        
	    }
	    
	    
	    
	    
	    
	    public static void main(String[] args) {
//	        Write a Java program that reads in 10 integers from the user and stores them in an ArrayList. 
//	        Then, output the elements of the ArrayList in reverse order.

//	        input : 1 2 3 4 5
//	        output : 5 4 3 2 1
//	        
	        int arr[] = {1,2,3,4,5};
	        
	        System.out.println(reverseArray(arr));
	        
	        
	    }

	}
