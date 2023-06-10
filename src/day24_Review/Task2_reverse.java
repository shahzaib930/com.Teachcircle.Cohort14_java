package day24_Review;

import java.util.Arrays;

public class Task2_reverse {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
	}
	//// task/// return
public static String reversestr(String str) {
	String str2 = "";
	for(int i = str.length()-1 ;i>=0; i--) {
		str2+=str.charAt(i);
	}
	return str2;
}

////2////// isPalendrome

	public static boolean isPalendrome(String str) {
		return str.equalsIgnoreCase(reversestr(str));
	}
	///String are anagram
	String str1 = "listen";
    String str2 = "silent";
	
    public static boolean isAnagram(String str,String str2) {
    	char arr[] = str.toCharArray();
        char arr2[] = str2.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr, arr2);
    }
  
    
    
    
    

}
