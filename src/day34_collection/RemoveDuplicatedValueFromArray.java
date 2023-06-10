package day34_collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatedValueFromArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,2,3,4,5};
		HashSet <Integer>arr1=new HashSet<>();
		for(int a : arr) {
			arr1.add(a);
		}
     System.out.println(arr1);
     /* 2nd  method:
      ArrayList<String> list2 = new ArrayList<>();
        
        for (int i = 0 ; i < list.size() ; i++) {
            
            if (!list2.contains(list.get(i))) {
                list2.add(list.get(i));
            }else {
                System.out.println(list.get(i) + " is duplicated");
            }
            
            
        }
        
      */
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
