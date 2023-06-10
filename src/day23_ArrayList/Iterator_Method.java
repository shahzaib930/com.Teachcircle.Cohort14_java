package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Method {

	public static void main(String[] args) {
		//it will give u true and false . if empty > false , notEmpty>true
	
		ArrayList<String> list = new ArrayList<>();

 		list.add("Bea");
 		list.add("Abdusamat");
 		list.add("Trookie");
 		list.addAll(Arrays.asList("Trookie", "Maria", "Sharuhan", "Ananas"));



 		Iterator<String> i = list.iterator();

 //		System.out.println(i.hasNext());
 //		
 //		System.out.println(i.next());
 //		
 //		System.out.println(i.hasNext());
 //		
 //		System.out.println(i.next());
 //		
 //		System.out.println(i.hasNext());
 //		

 		while (i.hasNext()) {
 			System.out.println(i.next());
 		}




 		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,3,4,5,6,7));


 		Iterator<Integer> numbers = nums.iterator();

 		while(numbers.hasNext()) {

 			Integer n = numbers.next();

 			if (n % 2 == 0) {
 				System.out.println(n);
 			}

 		}





 	}

 }
