package day23_ArrayList;

import java.util.ArrayList;

public class ArrayList_String {

	public static void main(String[] args) {
		
	//	to read ArrayList elements: variable.get(0);
        // to access last element of the list: variable.get(variable.size()-1);
        
        //to change a value in the list at an index: variable.set(index, "Change")
        // => Index is the index of array what you wanna change.
        
        //to remove an element, variable.remove(index);
        // => Index is the index of array what you wanna remove.
        //If you know what element you wanna remove: variable.remove(element);
        
        //you can add one list to another: list2.addAll(list1);	
		
		
		
		
		
		//ArrayList<data Type>list = new ArrayList<datatype but its Optional>();
		ArrayList<String>list = new ArrayList<>();
list.add("Bea");
list.add("touba ");
list.add("Apple");
System.out.println(list);
System.out.println(list.size());

list.add("shahzaib");//if we add anything it would show inthe end.
System.out.println(list);

//read element
System.out.println(list.get(0));

System.out.println(list.get(3));//same
System.out.println(list.get(list.size()-1));//same

list.add("hussain");
System.out.println(list.get(list.size()-1));

list.set(3, "axhaww");//remove and add
System.out.println(list);

list.remove(0);//remove
list.remove("hussain");//remove
System.out.println(list);

/////////////////Second Arraylist////////

ArrayList<String>list2= new ArrayList<>();


	}

}
