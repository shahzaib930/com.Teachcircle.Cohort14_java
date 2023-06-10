package day14_String;

public class GetDomoinName {

	public static void main(String[] args) {
		
	//write a program to get domain name from email..	
		
	String name = "first.last@gamil.com";
	//System.out.println(name.length());
	
	//System.out.println(name.substring(11,16));
	//second exect method
	int indexOfAt = name.indexOf('@')+1;
	int indexOfDot = name.indexOf('.');
	System.out.println(name.substring(indexOfAt,indexOfDot));
	
//	name =name.replace("first", "shahzaib");
//    name=name.replace("last","hussain");		
//		
//System.out.println(name);







	}

}
