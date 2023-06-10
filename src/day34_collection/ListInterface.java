package day34_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		//////// Collection /?/
		// collection.sort(list);---> to arrange the integer in order
        // List.get(); ---> to get the position of variable..
		// list.size(); --> use in arraylist to get total length.
		// we can add the value direct in --> new Arraylist<>(Arrys.asList(Value))
		
		
		/*ArrayList implements List interface, so we can also use:
        => List<dataType> list = new ArrayList<>();
      * List interfaces uses Collections framework, you can use it for diff things:
      * Collections.sort(list); => This will sort the list.
        Just like Arrays.sort() method
      * Collections.max(list); => Gives the max value from list.
        Just like list.get(list.size()-1);  //which will give the last value.
      * Collections.min(list); => Gives the min value from list.
        Just like list.get(index 0);
      * 
      * List implements Collection Interface so we can also use:
      * Collection<dataType> list = new ArrayList<>(here you can add an array
      *                                     using Arrays.asList(val1,val2,val3));
      * You can also use for Each loop to find max value(Shown below Collections)
      * */
		
		
ArrayList<Integer> list1 = new ArrayList<>();
        
        list1.add(1);
        
        list1.addAll(Arrays.asList(3,5,7));
        
        System.out.println(list1);
        
        List<Integer> list2 = new ArrayList<>();
        
        list2.add(2);
        list2.addAll(list1);
        list2.addAll(Arrays.asList(4,6,8));
        
        System.out.println(list2);
        
        Collections.sort(list2);
        
        System.out.println(list2);
        
        System.out.println(Collections.max(list2));
        
        System.out.println(Collections.min(list2));
        
        System.out.println("Min Value is "+ list2.get(0));
        
        System.out.println("Max value is "+ list2.get(list2.size()-1));
        
        
        
        Collection<Integer> list3 = new ArrayList<>(Arrays.asList(2,1,4,22,44,66,78,9));
        
        System.out.println(list3);
        
        Integer max = 0;
        
        for (Integer a : list3) {
            if (a > max) {
                max = a;
            }
        }
        
        System.out.println("Max value is "+max);
        
        
        
        System.out.println(list3.contains(44));
        

		
	}

}
