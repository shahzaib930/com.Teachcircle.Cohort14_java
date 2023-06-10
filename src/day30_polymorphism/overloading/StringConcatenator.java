package day30_polymorphism.overloading;

import java.util.Arrays;

public class StringConcatenator {

	public String Concatenate(String a, String b) {
		return a +b;
	}
	public String Concatenate(String a,String b ,String c) {
		return a+b+c;
	}
	public String Concatenate(String a,String b ,String c,String d) {
		return a+b+c+d;
	}
	public String Concatenate(String[] arr ) {
		String a ="";
		for(int i = 0; i<arr.length ;i++) {
			a+=arr[i];
		}
		return a;
	}
	
	

//public static void main(String[] args) {
//	StringConcatenator sc = new StringConcatenator();
//	String b =sc.Concatenate("Shahzaib", " 20");
//	System.out.println(b);
//
//	String arr2[] = {"helo ","its ","me ","Sz "};
//	
//	System.out.println(sc.Concatenate(arr2));
//	
//	
	
	
	public static void main(String[] args) {
        StringConcatenator sc = new StringConcatenator();
        
        String str1 = "Hello!";
        String str2 = "Cohort 14";
        String str3 = "I Love TechCircle";
        String str4 = "I'm happy to be part of this journey";
        String[] strArr = {"HELLO", "TechCircle", "I'm from Cohort14", "Learnig Overloading"};
        
        
        System.out.println("With 2 Strings: " + sc.Concatenate(str1, str2));
        System.out.println("with 3 Strings: " + sc.Concatenate(str1,str2,str3));
        System.out.println("with 4 Strings: " + sc.Concatenate(str1,str2,str3, str4));
        
        
        System.out.println("Array of Strings: " + sc.Concatenate(strArr));
        
        
    }
	
	
	
	
}