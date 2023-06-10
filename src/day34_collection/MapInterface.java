package day34_collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
public static void main(String[] args) {
	

	// Map<Key,value> variableName= new HashMap<>();
	Map <String,Integer>phoneBook= new HashMap<>();
	phoneBook.put("shahzaib",73239492);
	phoneBook.put("ali",73237373);
	
	phoneBook.remove("ali");// --> use to remove 
	System.out.println(phoneBook.size());// ----> to get the Length. (2)
	
	System.out.println(phoneBook.get("shahzaib"));// _-->tp print the value
	
	phoneBook.put("shahzaib",73555552);// --> to update the value
	System.out.println(phoneBook.get("shahzaib"));
	
	System.out.println(phoneBook.containsKey("shahzaib"));//true or False
	System.out.println(phoneBook.get("hayel"));// Null
	
	// for each 
	
	
}	
}
