package day13_String;

public class StringTrimMethod {

	public static void main(String[] args) {
		//Trim remove the space from both sides
		//but can't remove space between the characters
		
		String str = "        hello";
        System.out.println(str);
        System.out.println(str.length());
        str = str.trim();
        
        System.out.println(str);
        System.out.println(str.length());
        
        
        String str2 = "hello            ";
        System.out.println(str2);
        System.out.println(str2.length());
        
        System.out.println(str2.trim());
        System.out.println(str2);
        str2 = str2.trim();
        System.out.println(str2);
        
        
        
        String str3 = "       Hello                  java               ";
        
        System.out.println(str3);
          
        str3 = str3.trim();
        System.out.println(str3);

		
		

	}

}
