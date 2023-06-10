package day24_Review;

public class Task03 {

public static void main(String[] args) {
        
        String str1 = "abcddaaeefffghiijjkkl";
        String str4 = "abcddaaeefffgh";
        
        System.out.println(removeDuplicates(str1));
        
        System.out.println(removeDuplicates(str4));
        
        
    }
public static String removeDuplicates(String str1) {
    String output = "";
    
    for (int i = 0; i < str1.length(); i++) {
        char letter = str1.charAt(i);
        if (!output.contains(Character.toString(letter))) {
            output += letter;
        }
        
    }
    
    return output;
}

public static String removeDuplicates2(String str4) {
    // String str4 = "AAABBBBCCC";
    String str5 = "";

    while (str4.length() > 0) {
        str5 += str4.substring(0, 1);
        str4 = str4.replace(str4.substring(0, 1), "");
    }

    return str5;
    
}
    
//--------------------------------------------------//
 
	   
	  
  
  
    
    
    
    
    
    
    
    
    
    
    
}
