package day13_String;

public class StringMethodIndexOf {

	public static void main(String[] args) {
	
		String name = "President George Washington";
		//indexOf //lastindexOf
		// low or upper case does matter the position..
		//for unexisted letter shows -1
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf('P'));
		
		System.out.println(name.indexOf('e',5));
		System.out.println(name.indexOf(9));//space -1

		System.out.println(name.indexOf("Geo"));//10
		
		
		
	}

}
